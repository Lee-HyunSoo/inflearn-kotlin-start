package dto

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Gradeur -> TODO()
    }
}


sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1000L)
class Sonata : HyundaiCar("소나타", 2000L)
class Gradeur : HyundaiCar("그렌져", 3000L)