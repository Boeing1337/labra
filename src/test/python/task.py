import unittest
import threading
import time
from io import StringIO
import sys
from unittest.mock import patch

class TestRealTimeGenerator(unittest.TestCase):

    @patch('builtins.input', return_value='0')
    def test_stop_after_first_generation(self, mock_input):
        global generated_numbers, stop_flag
        generated_numbers = []
        stop_flag = False

        captured_output = StringIO()
        sys.stdout = captured_output

        # Запускаем main() в отдельном потоке, чтобы не блокировать тест
        def run_main():
            from __main__ import main
            main()

        thread = threading.Thread(target=run_main, daemon=True)
        thread.start()

        # Ждём, пока хотя бы одно число сгенерируется
        time.sleep(1.5)

        # Проверяем, что хотя бы одно число было выведено
        output = captured_output.getvalue().strip().split('\n')
        self.assertGreater(len(output), 0)
        self.assertTrue(all(line.lstrip('-').isdigit() for line in output[:-1]))  # Все строки — числа

        # Убеждаемся, что после ввода 0 вывелся итоговый список
        self.assertIn("Все сгенерированные числа до остановки:", captured_output.getvalue())

        # Проверяем, что список не пустой
        self.assertGreater(len(generated_numbers), 0)

        sys.stdout = sys.__stdout__

    @patch('builtins.input', return_value='0')
    def test_multiple_generations_before_stop(self, mock_input):
        global generated_numbers, stop_flag
        generated_numbers = []
        stop_flag = False

        captured_output = StringIO()
        sys.stdout = captured_output

        def run_main():
            from __main__ import main
            main()

        thread = threading.Thread(target=run_main, daemon=True)
        thread.start()

        time.sleep(3)  # Должно сгенерироваться 3 числа

        sys.stdout = sys.__stdout__
        self.assertGreaterEqual(len(generated_numbers), 3)