package ktclass

fun main() {
    val person = Person("person", 30)
    println(person.name) // getter
    person.age = 10 // setter
    println(person.age) // getter
}

class Person (val name: String, var age: Int) {
    // 클래스가 초기화 되는 시점에 한번 호출되는 블록
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("부 생성자1")
    }

    constructor() : this("person") {
        println("부 생성자2")
    }
}
