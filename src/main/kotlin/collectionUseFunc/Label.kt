package collectionUseFunc

fun main() {
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("$i $j")
        }
    }
}