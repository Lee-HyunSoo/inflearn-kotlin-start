package type

fun main() {
    printAgeIfPersonNull(null) // null
    printAgeIfPersonNull(Person("", 100)) // 100
}

// instanceof
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person // (Person) obj, 생략 가능
        println(person.age) // 위에가 생략 되었을 경우 println(obj.age) 로 사용 가능
    }
}

// instanceof 의 반대
fun printAgeIfPersonNot(obj: Any) {
    if (obj !is Person) {
    }
}

// obj 에 null 이 들어올 수 있다면?
fun printAgeIfPersonNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
