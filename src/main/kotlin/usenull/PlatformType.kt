package usenull

fun main() {
    val person = Person("공부하는 개발자")
//    startsWithPlatform(person.name) // @Nullable 때문에 null 이 들어갈수도 있음 -> 에러
}

fun startsWithPlatform(str: String): Boolean {
    return str.startsWith("A")
}