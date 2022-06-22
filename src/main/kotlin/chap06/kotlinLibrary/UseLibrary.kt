package chap06.kotlinLibrary

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    // 파일을 닫는 코드가 use함수에 들어가 있기 때문에 따로 정의하고 코드를 작성할 필요가 없다
    PrintWriter(FileOutputStream("C:\\Users\\User\\IdeaProjects\\Kotlin-Notes\\src\\main\\kotlin\\chap06\\kotlinLibrary\\useTest.txt")).use {
        it.println("Hello")
    }
}