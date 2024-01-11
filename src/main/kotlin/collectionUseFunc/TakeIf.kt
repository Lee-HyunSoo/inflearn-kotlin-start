package collectionUseFunc

// takeIf 미사용
fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// takeIf 사용
fun getNumberOrNull2(number: Int): Int? {
    return number.takeIf { it > 0 }
}