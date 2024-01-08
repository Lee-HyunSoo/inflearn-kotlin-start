package operator

fun main() {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(1000L)

    println(money1 == money2) // true, 값만 (동등성) 비교, java: money1.equals(money2)
    println(money1 === money2) // false, 객체의 동일성 비교
}