package collectionUseFunc

fun main() {
    var numbers = listOf(1, 2, 3)

    for (number in numbers) {
        println(number)
    }

    numbers
        .map { it + 1 }
        .forEach { println(it)}

    numbers
        .map {number -> number + 1}
        .forEach {number -> println(number)}

    // break
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }
}