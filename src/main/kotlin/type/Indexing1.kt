package type

fun main() {
    val name = "test"
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent() // indentation (들여쓰기) 를 제거해주는 메서드
    println(str)
}