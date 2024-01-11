package ktobject

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
