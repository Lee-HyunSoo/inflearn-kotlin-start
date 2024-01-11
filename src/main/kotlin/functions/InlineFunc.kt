package functions

fun main() {
    println(3.add2(4))
}

fun Int.add3(other: Int): Int {
    return this + other
}

inline fun Int.add4(other: Int): Int {
    return this + other
}