package operator

fun main() {

    val money1 = Money(1000L)
    val money2 = Money(2000L)
    println(money1.plus(money2)) // 연산자 오버로딩을 사용하지 않은 경우
    println(money1 + money2) // 연산자 오버로딩 사용
    // 결과: Money(amount=3000)
}