package ru.synergy

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val testArray = intArrayOf(1, -2, 3, 0, -5, 7, 4)
    val (sum, count) = findPositiveSumAndCount(testArray)
    println("Сумма положительных элементов: $sum")
    println("Количество положительных элементов: $count")
}

public fun findPositiveSumAndCount(arr: IntArray): Pair<Int, Int> {
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