package ktFeature

data class Person (
    val name: String,
    var age: Int)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person("test", 100)
//    val (name, age) = person

    // componentN
    val name = person.component1()
    val age = person.component2()

    println("이름 : ${name}, 나이 : ${age}")

    val person2 = Person2("test", 100)
    val (name2, age2) = person2
    println("이름 : ${name2}, 나이 : ${age2}")
}
