package dto

fun main() {
    val dto1 = PersonDto("test", 10)
    val dto2 = PersonDto("test", 10)
    println(dto1 == dto2) // true
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}