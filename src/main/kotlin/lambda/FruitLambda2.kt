package lambda

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 생성한 람다 사용
    filterFruits(fruits, isApple2)
    filterFruits(fruits, {fruit: Fruit -> fruit.name == "사과"})

    // 소괄호 안에 함수가 들어갈 경우 이런식으로 뺄 수 있다.
    // 단, 함수 파라미터의 위치가 제일 마지막 이어야한다.
    filterFruits(fruits) {fruit: Fruit -> fruit.name == "사과"}

    // 타입 생략도 가능하다.
    filterFruits(fruits) {fruit -> fruit.name == "사과"}

    // 화살표 생략도 가능하다.
    filterFruits(fruits) {it.name == "사과"}
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
