package operator

fun main() {

    // Lazy 연산
    if (fun1() || fun2()) {
        // or 비교 시에는 둘 중 하나만 true 면 true 이다.
        // 현재 fun1() 은 true 를 return 하기 때문에 fun1() 만 봐도 해당 if 문은 true 이다.
        // 때문에 fun2() 를 가지 않고 본문이 실행 된다.
        println("본문")
    }

    if (fun2() && fun1()) {
        // and 비교 시에는 둘다 true 여야 수행된다.
        // 현재 fun2() 는 false 이기 때문에 해당 if 문은 무조건 실행 불가능 이다.
        // 때문에 fun1() 을 가지 않고 바로 블럭 밖으로 나간다.
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}