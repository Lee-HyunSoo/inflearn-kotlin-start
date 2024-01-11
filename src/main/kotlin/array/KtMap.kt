package array

fun main() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday" // oldMap.put(1, "Monday")
    oldMap[2] = "Tuesday"

    mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}