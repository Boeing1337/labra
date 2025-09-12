import random
import threading
import time

generated_numbers = []
stop_flag = False

def generator():
    """Фоновая генерация чисел каждую секунду"""
    global stop_flag
    while not stop_flag:
        num = random.randint(-100, 100)
        generated_numbers.append(num)
        print(num)
        time.sleep(1)

def main():
    global stop_flag

    # Запускаем генератор в фоновом потоке
    gen_thread = threading.Thread(target=generator, daemon=True)
    gen_thread.start()

    print("Генерация началась. Введите '0' и нажмите Enter для остановки.")

    # Ждём ввода от пользователя
    user_input = input().strip()
    if user_input == "0":
        stop_flag = True
        time.sleep(1.2)  # Даем время на завершение последней генерации (если она в процессе)

    # Выводим все сгенерированные числа (кроме введенного 0 — он не был добавлен)
    print("\nВсе сгенерированные числа до остановки:")
    print(generated_numbers)

if __name__ == "__main__":
    main()