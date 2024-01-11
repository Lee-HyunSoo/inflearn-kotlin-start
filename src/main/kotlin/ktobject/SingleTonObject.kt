package ktobject

fun main() {
    println(SingleTon.a)
    SingleTon.a += 10
    println(SingleTon.a)
}

object SingleTon {
    var a: Int = 0
}