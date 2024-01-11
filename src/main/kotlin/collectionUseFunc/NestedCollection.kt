package collectionUseFunc

fun main() {
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1000, 2000),
            Fruit(2L, "사과", 1200, 2200),
            Fruit(3L, "사과", 12000, 2200),
            Fruit(4L, "사과", 12000, 2200),
        ),
        listOf(
            Fruit(5L, "바나나", 2000, 2000),
            Fruit(6L, "바나나", 1200, 2200),
            Fruit(7L, "바나나", 12000, 2200),
        ),
        listOf(
            Fruit(8L, "수박", 12000, 2200),
        )
    )

    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    fruitsInList.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)