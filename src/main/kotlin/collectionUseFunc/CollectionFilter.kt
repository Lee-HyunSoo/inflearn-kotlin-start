package collectionUseFunc

fun main() {
    val fruits = listOf(
        Fruit(1L, "사과", 1000, 2000),
        Fruit(2L, "사과", 1200, 2200),
        Fruit(3L, "바나나", 12000, 2200),
        Fruit(4L, "수박", 12000, 2200),
    )

    // 사과만 주세요
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // 필터에서 index 가 필요한 경우
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // 사과의 가격을 알려주세요
    val applePrices = fruits
        .filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    // map 사용 시 index 가 필요할 때
    val applePrices2 = fruits
        .filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }

    // null 이 아닌 것만 매핑
//    val values = fruits
//        .filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrValue() }
}
