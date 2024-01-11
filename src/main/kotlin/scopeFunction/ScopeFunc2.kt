package scopeFunction

fun main() {
    val person = Person("test", 100)

    // 1. 전통적인 if-else 활용
    if (person != null && person.isAdult) {
        println(person)
    } else {
        throw IllegalArgumentException("ex")
    }

    // 2. scope function 활용
    person?.takeIf { it.isAdult }
        ?.let { println(person) }
        ?: throw IllegalArgumentException("ex")
}
