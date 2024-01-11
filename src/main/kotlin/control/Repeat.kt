package control

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun oneToThree() {
    for (i in 1..3) {
        println(i)
    }
}

fun threeToOne() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun stepBy2() {
    for (i in 1..5 step 2) {
        println(i)
    }
}

fun kotlinWhile() {
    var i = 1;
    while (i <= 3) {
        println(i)
        i++;
    }
}