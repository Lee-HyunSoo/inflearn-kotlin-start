package type

fun main() {
    // 명시적 형변환
    val number1 = 3
//    val number2: Long = number1 // type mismatch
    val number2: Long = number1.toLong()

    // 계산 시 명시적 형변환
    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble() // (Double) 이 아니라 .toDouble() 을 사용한다.
    println(result)

    // null 이 들어갈 수 있는 경우
    val number5: Int? = 3
//    val number6: Long = number5.toLong() // number5 가 null 일수도 있기 때문에 null 에 . 을 찍는 꼴 -> NPE
    val number6: Long = number5?.toLong() ?: 0L // safe call + elvis
}