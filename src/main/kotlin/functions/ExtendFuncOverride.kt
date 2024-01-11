package functions

fun main() {
    val train = Train()
    train.isExpensive() // Train 의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train 의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt 의 확장함수
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}