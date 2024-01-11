package array

fun main() {
    val numbers = listOf(100, 200) // 불변 리스트
//    val numbers = mutableListOf(100, 200) // 가변 리스트 생성
    val empty = emptyList<Int>() // List<Integer> empty = new ArrayList<>();

    printNumbers(emptyList()) // 타입 추론이 가능한 경우 emptyList() 를 그냥 넣을 수 있다.

    println(numbers[0])

    // for each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for
    for ((idx, number) in numbers.withIndex()) {
        println("$idx $number")
    }
}

private fun printNumbers(numbers: List<Int>) {

}