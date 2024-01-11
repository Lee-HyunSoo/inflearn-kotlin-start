package functions

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 문자열 가장 끝의 문자를 가져오는 코드
fun String.lastChar(): Char {
    // this 를 통해 String 자신, 함수를 호출한 instance 를 가져 온다.
    return this[this.length - 1]
}