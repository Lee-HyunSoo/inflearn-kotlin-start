package scopeFunction

fun main() {
    // let을 언제 사용해야 하는가?
    val strings = listOf("apple", "car")
    strings
        .map { it.length }
        .filter { it > 3 } // 여기까지 하면 List<Int> 가 나온다.
//        .let(::println) // List<Int> 를 출력한다.
        .let { lengths -> println(lengths) }

    val str = "test"
    val length = str?.let {
        println(it.uppercase())
        it.length// 람다의 결과물, 밖으로 반환
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers
        .first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem
            else "!$firstItem"
        }
        .uppercase()
    println(modifiedFirstItem)

//    val person = Person("test", 100)
//        .run(personRepository::save)
//    val person = Person("test", 100).run {
//        hobby = "독서"
//        personRepository.save(this)
//    }

    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값: $it") }
        .add("four")
}

fun createPerson(
    name: String,
    age: Int,
    hobby: String,
): Person {
    return Person(
        name = name,
        age = age,
    ).apply {
        this.hobby = hobby
    }
}

fun createPerson2(person: Person) {
    return with(person) {
        Person(
            name = name,
            age = age
        )
    }
}