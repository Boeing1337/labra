import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.synergy.findPositiveSumAndCount

class PositiveSumTest {

    @Test
    fun testMixedPositiveNegativeZero() {
        val arr = intArrayOf(1, -2, 3, 0, -5, 7, 4)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(15, sum)   // 1 + 3 + 7 + 4
        assertEquals(4, count)
    }

    @Test
    fun testAllPositive() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(15, sum)
        assertEquals(5, count)
    }

    @Test
    fun testAllNegative() {
        val arr = intArrayOf(-1, -2, -3, -4)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(0, sum)
        assertEquals(0, count)
    }

    @Test
    fun testAllZero() {
        val arr = intArrayOf(0, 0, 0)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(0, sum)
        assertEquals(0, count)
    }

    @Test
    fun testEmptyArray() {
        val arr = intArrayOf()
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(0, sum)
        assertEquals(0, count)
    }

    @Test
    fun testSinglePositive() {
        val arr = intArrayOf(10)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(10, sum)
        assertEquals(1, count)
    }

    @Test
    fun testSingleNegative() {
        val arr = intArrayOf(-10)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(0, sum)
        assertEquals(0, count)
    }

    @Test
    fun testSingleZero() {
        val arr = intArrayOf(0)
        val (sum, count) = findPositiveSumAndCount(arr)
        assertEquals(0, sum)
        assertEquals(0, count)
    }
}