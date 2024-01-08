package type

fun main() {
    val person = Person("a", 100)
//    System.out.println(String.format("이름: %s", person.name)) // java 문자열 중간에 값 넣는 법
    println("이름: ${person.name}") // interpolation

    val name = person.name
    println("이름: $name") // 이렇게 중괄호 생략도 가능하다.
}