package exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
    readFile()
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null;
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFileV2(path: String) {
    // 코틀린에선 try with resources 구문이 없다.
    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}