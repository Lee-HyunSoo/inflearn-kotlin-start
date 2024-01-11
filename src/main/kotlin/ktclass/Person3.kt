package ktclass

fun main() {

}

class Person3(
    val name: String = "test",
    var age: Int = 1
){
    init {
        throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    // 방법 1
    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    // 방법 2
//    val uppercaseName: String
//        get() = this.name.uppercase()

    // custom getter 를 사용하기 위해 기본 생성자의 name 에서는 val 키워드를 뺐다.
//    val name = name
//        get() = field.uppercase()
}