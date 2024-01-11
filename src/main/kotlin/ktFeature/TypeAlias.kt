package ktFeature

// 1. 타입 축약
// filter: (Fruit) -> Boolean
// 이 타입이 너무 길고, 파라미터가 더 많아지면 코드가 너무 늘어진다.
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {
}

// typealias 를 사용해 축약
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter) {
}

// 2. 긴 이름의 클래스 축약
data class UltraSuperGuardianTribe(
    val name: String
)

// 축약해서 USGTMap 으로 사용 가능하다.
typealias USGTMap = Map<String, UltraSuperGuardianTribe>