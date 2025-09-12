package ru.synergy

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val (sum, count) = findPositiveSumAndCount(intArrayOf(1, -2, 3, 0, -5, 7, 4))
    println("Сумма положительных элементов: $sum")
    println("Количество положительных элементов: $count")

    val threshold = 4
    val (count2, product) = countAndProductExceeding(intArrayOf(1, 5, 3, 8, 2, 9), threshold)
    println("Количество элементов > $threshold: $count2")
    println("Их произведение: $product")
}

fun findPositiveSumAndCount(arr: IntArray): Pair<Int, Int> {
    var sum = 0
    var count = 0

    for (element in arr) {
        if (element > 0) {
            sum += element
            count++
        }
    }

    return Pair(sum, count)
}

fun countAndProductExceeding(arr: IntArray, threshold: Int): Pair<Int, Long> {
    var count = 0
    var product: Long = 1
    var hasExceeding = false

    for (element in arr) {
        if (element > threshold) {
            count++
            product *= element.toLong()
            hasExceeding = true
        }
    }

    if (!hasExceeding) {
        product = 0 // Произведение = 0, если нет подходящих элементов
    }

    return Pair(count, product)
}
