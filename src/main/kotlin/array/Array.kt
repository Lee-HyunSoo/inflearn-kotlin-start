package array

fun main() {
    val arr = arrayOf(100, 200)
    for (i in arr.indices) {
        println("$i ${arr[i]}")
    }

    val arr2 = arr.plus(300) // 배열에 add

    for ((i, value) in arr2.withIndex()) {
        println("$i $value")
    }
}