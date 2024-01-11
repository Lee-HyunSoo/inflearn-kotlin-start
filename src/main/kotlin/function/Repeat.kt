package function

fun main() {
//    repeat("hello world", 3, true)
    repeat("hello world")

//    repeat("hello world", 3, false)
    repeat("hello world", useNewLine = false)
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

