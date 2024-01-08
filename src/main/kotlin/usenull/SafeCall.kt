package usenull

fun main() {
    // elvis
    val str: String? = null
    println(str?.length ?: 0)
}