package array

fun main() {
    val numbers = setOf(100, 200) // 불변 집합
    val mutableNumbers = mutableSetOf(100, 200) // 가변 집합, 기본 구현체는 LinkedHashSet 이다.

    // for each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }
}