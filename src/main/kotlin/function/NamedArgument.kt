package function

fun main() {
    printNameAndGender(name = "이현수", gender = "남")
    printNameAndGender(gender = "남", name = "이현수")
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}