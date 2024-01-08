package operator

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)


    if (money1 > money2) {
        println("Money1 이 Money2 보다 금액이 큽니다.")
    }
}