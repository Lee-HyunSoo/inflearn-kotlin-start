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

    // 변수에 함수 할당 1 (람다를 만드는 방법 1)
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 변수에 함수 할당 2 (람다를 만드는 방법 2)
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 변수에 할당 되어있는 함수 호출 1 (람다를 직접 호출하는 방법 1)
    isApple(fruits[0])

    // 변수에 할당 되어있는 함수 호출 2 (람다를 직접 호출하는 방법 2)
    isApple.invoke(fruits[0])

    // 람다에도 타입이 있다.
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple4: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }
}