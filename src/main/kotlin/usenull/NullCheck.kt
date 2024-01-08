package usenull

// return 타입에 null 이 들어갈 수 없는 경우
fun startsWithA1(str: String?): Boolean { // 타입 끝에 ? 를 붙임으로써 null 이 들어올 수 있음을 명시, return 타입 : Boolean
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

// return 타입에 null 이 들어갈 수도 있는 경우
fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

// 들어오는 파라미터는 null 일 수 있지만 return 타입은 null 일 수 없는 경우
fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}