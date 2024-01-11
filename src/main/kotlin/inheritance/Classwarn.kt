package inheritance

fun main() {
    Derived(300)
}

open class Base( // base class 를 다른 클래스가 상속 받을 수 있게 open 으로 열어주었다.
    open val number: Int = 100 // 이 값도 누군가 override 가능하게 open 으로 열어주었다.
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}