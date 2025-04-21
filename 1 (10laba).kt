fun printNumber(n: Int): List<Int> {
    return if (n == 0) {
        emptyList()
    } else {
        (1..n).toList()  // Создание списка от 1 до n
    }
}

fun main() {
    println(printNumber(0))  // Печать пустого списка
    println(printNumber(2))  // Печать списка [1, 2]
    println(printNumber(5))  // Печать списка [1, 2, 3, 4, 5]
}