package collectionUseFunc

fun main() {
    val fruits = listOf(
        Fruit(1L, "사과", 1000, 2000),
        Fruit(2L, "사과", 1200, 2200),
        Fruit(3L, "바나나", 12000, 2200),
        Fruit(4L, "수박", 12000, 2200),
    )

    val isAllApple = fruits.all {fruit -> fruit.name == "사과"}
    val isNoApple = fruits.none {fruit -> fruit.name == "사과"}
    val isAnyApple = fruits.any {fruit -> fruit.factoryPrice >= 10000}
    val fruitCount = fruits.count()
    val fruitSort = fruits.sortedBy { fruit -> fruit.currentPrice }
    val fruitSortByDesc = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distinctFruitNames = fruits
        .distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    fruits.first()
    fruits.firstOrNull()
    fruits.last()
    fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name } // 과일 이름이 key
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id } // 과일 id가 key, 중복되지 않는 key 로 매핑 시 사용
    val map3: Map<String, List<Long>> = fruits.groupBy(
        { fruit -> fruit.name },
        { fruit -> fruit.factoryPrice }
    )
    val map4: Map<Long, Long> = fruits.associateBy(
        { fruit -> fruit.id },
        { fruit -> fruit.factoryPrice }
    )

    val map5: Map<String, List<Fruit>> = fruits
        .groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }

}

private fun filterFruits(
    fruit: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruit.filter(filter)
}