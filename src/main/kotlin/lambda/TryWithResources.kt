package lambda

import java.io.BufferedReader
import java.io.FileReader

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}