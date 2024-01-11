package ktclass

fun main() {

}

class Person4(
    name: String = "test",
    var age: Int = 1
){
    init {
        throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    // custom setter
    var name = name
        set(value) {
            field = value.uppercase()
        }
}