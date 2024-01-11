package functions

fun main() {
    val person = Person("A", "B", 100)
    person.nextYearAge() // 확장 함수가 아니라 멤버 함수를 호출한다.
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}