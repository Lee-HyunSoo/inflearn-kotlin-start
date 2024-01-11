package functions

fun createPerson(firstName: String, lastName: String): Person {
    // 지역 함수
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("$fieldName 은 비어있을 수 없습니다. 현재 값: $name")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}