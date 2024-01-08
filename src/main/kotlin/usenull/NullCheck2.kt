package usenull

// return 타입에 null 이 들어갈 수 없는 경우
fun startsWithA11(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다.")
}

// return 타입에 null 이 들어갈 수도 있는 경우
fun startsWithA22(str: String?): Boolean? {
    return str?.startsWith("A")
}

// 들어오는 파라미터는 null 일 수 있지만 return 타입은 null 일 수 없는 경우
fun startsWithA33(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}