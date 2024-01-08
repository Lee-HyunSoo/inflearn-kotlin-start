package usenull

fun main() {
    println(startsWithNotNull("ABC"))
//    println(startsWithNotNull(null)) // 런타임 시 NPE
}

fun startsWithNotNull(str: String?): Boolean {
    return str!!.startsWith("A") // !! -> 이 변수는 절대 null 이 아니라는 뜻
}