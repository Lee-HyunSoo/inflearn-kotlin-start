package collectionUseFunc

// takeUnless 미사용
fun getNumberOrNullV3(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// takeUnless 사용
fun getNumberOrNullV4(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}