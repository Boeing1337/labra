import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.synergy.countAndProductExceeding

class CountAndProductExceedingTest {

        @Test
        fun testMixedElementsSomeExceed() {
            val arr = intArrayOf(1, 5, 3, 8, 2, 9)
            val b = 4
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(3, count)     // 5, 8, 9
            assertEquals(360L, product) // 5 * 8 * 9
        }

        @Test
        fun testAllExceed() {
            val arr = intArrayOf(10, 15, 20)
            val b = 5
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(3, count)
            assertEquals(3000L, product) // 10 * 15 * 20
        }

        @Test
        fun testNoneExceed() {
            val arr = intArrayOf(1, 2, 3, 4)
            val b = 5
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(0, count)
            assertEquals(0L, product) // особый случай: нет элементов → произведение = 0
        }

        @Test
        fun testAllEqual() {
            val arr = intArrayOf(3, 3, 3)
            val b = 3
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(0, count)
            assertEquals(0L, product)
        }

        @Test
        fun testEmptyArray() {
            val arr = intArrayOf()
            val b = 1
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(0, count)
            assertEquals(0L, product)
        }

        @Test
        fun testSingleExceeding() {
            val arr = intArrayOf(7)
            val b = 5
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(1, count)
            assertEquals(7L, product)
        }

        @Test
        fun testSingleNotExceeding() {
            val arr = intArrayOf(2)
            val b = 5
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(0, count)
            assertEquals(0L, product)
        }

        @Test
        fun testNegativeNumbers() {
            val arr = intArrayOf(-5, -1, 2, -3)
            val b = -2
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(2, count)     // 2 и -1 (т.к. -1 > -2)
            assertEquals(-2L, product) // 2 * (-1)
        }

        @Test
        fun testZeroThreshold() {
            val arr = intArrayOf(-2, 0, 1, 3)
            val b = 0
            val (count, product) = countAndProductExceeding(arr, b)
            assertEquals(2, count)     // 1, 3
            assertEquals(3L, product)  // 1 * 3
        }

}