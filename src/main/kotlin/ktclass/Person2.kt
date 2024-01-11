package ktclass

fun main() {
    val person2 = JavaPerson("person", 100)
    println(person2.name)
    person2.age = 30
    println(person2.age)
}

class Person2(
    val name: String = "person2",
    var age: Int = 1
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // custom getter
//    val isAdult: Boolean
//        get() {
//            return this.age >= 20
//        }

    // custom getter
//    val isAdult: Boolean
//        get() = this.age >= 20
}
