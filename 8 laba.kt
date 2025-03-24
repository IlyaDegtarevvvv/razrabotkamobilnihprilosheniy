import kotlin.math.pow

// 1. Сумма элементов списка
fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}

// 2. Разность максимального и минимального значения
fun differenceMaxMin(numbers: List<Int>): Int {
    return numbers.maxOrNull()!! - numbers.minOrNull()!!
}

// 3. Объединение двух списков
fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}

// 4. Проверка условия с prob, prize и pay
fun isProfitable(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

// 5. Повторение (аналогично заданию 4)
fun isProfitable2(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

// 6. Проверка суммы двух чисел
fun isSumLessThan100(a: Int, b: Int): Boolean {
    return (a + b) < 100
}

// 7. Проверка делимости на 100
fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}

// 8. Подсчет кадров
fun calculateFrames(minutes: Int, fps: Int): Int {
    return minutes * 60 * fps
}

// 9. Проверка k^k == n
fun isKPowerKEqualN(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
}

// 10. Рекурсивная функция для повторения строки
fun repeatString(txt: String, n: Int): String {
    return if (n <= 0) "" else txt + repeatString(txt, n - 1)
}

// 11. Решение уравнения
fun evaluateExpression(expression: String): Double {
    return when {
        expression.contains("+") -> {
            val parts = expression.split("+")
            parts[0].toDouble() + parts[1].toDouble()
        }
        expression.contains("-") -> {
            val parts = expression.split("-")
            parts[0].toDouble() - parts[1].toDouble()
        }
        expression.contains("*") -> {
            val parts = expression.split("*")
            parts[0].toDouble() * parts[1].toDouble()
        }
        expression.contains("/") -> {
            val parts = expression.split("/")
            parts[0].toDouble() / parts[1].toDouble()
        }
        else -> throw IllegalArgumentException("Unsupported operation")
    }
}

// 12. Генерация слова Google
fun generateGoogle(number: Int): String {
    val oCount = number.coerceAtLeast(0)
    return "G${"o".repeat(oCount)}gle"
}

// 13. Приветствие
fun greet() {
    println("Привет, мир!")
}

// 14. Сумма двух чисел
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 15. Сравнение чисел
fun maxOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 16. Определение четности
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 17. Факториал числа
fun factorial(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Факториал для отрицательных чисел не определен.")
    return if (n == 0) 1 else n * factorial(n - 1)
}

// 18. Проверка на простоту
fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true
}

// 19. Сумма чисел в массиве
fun sumArray(numbers: IntArray): Int {
    return numbers.sum()
}

// 20. Наибольшее число в массиве
fun maxInArray(numbers: IntArray): Int? {
    return numbers.maxOrNull()
}

// 21. Сортировка массива
fun sortArray(numbers: IntArray): IntArray {
    return numbers.sortedArray()
}

// 22. Проверка палиндрома
fun isPalindrome(input: String): Boolean {
    return input == input.reversed()
}

// 23. Количество символов
fun countCharacters(input: String): Int {
    return input.length
}

// 24. Конвертация в верхний регистр
fun toUpperCase(input: String): String {
    return input.uppercase()
}

// 25. Объединение строк
fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}

// 26. Возвращение последнего элемента массива
fun lastElement(array: IntArray): Int? {
    return array.lastOrNull()
}

// 27. Проверка наличия элемента
fun containsElement(array: IntArray, element: Int): Boolean {
    return element in array
}

// 28. Создание массива от 1 до N
fun createArrayFrom1ToN(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}

// 29. Максимум и минимум
fun minMax(array: IntArray): Pair<Int?, Int?> {
    return Pair(array.minOrNull(), array.maxOrNull())
}

// 30. Сумма чисел от 1 до N
fun sumFrom1ToN(n: Int): Int {
    return (1..n).sum()
}

// 31. Преобразование Celsius в Fahrenheit
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

// 32. Обратный порядок строки
fun reverseString(input: String): String {
    return input.reversed()
}

// 33. Поиск элемента по индексу
fun findElementByIndex(array: IntArray, index: Int): Int? {
    return if (index in array.indices) array[index] else null
}

// 34. Удаление пробелов из строки
fun removeSpaces(input: String): String {
    return input.replace(" ", "")
}

// 35. Сумма первых N натуральных чисел
fun sumFirstNNaturalNumbers(n: Int): Int {
    return (1..n).sum()
}

// 36. Проверка строки на наличие подстроки
fun containsSubstring(string: String, substring: String): Boolean {
    return substring in string
}

// 37. Печать таблицы умножения
fun printMultiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}

// 38. Нахождение длины строки
fun stringLength(input: String): Int {
    return input.length
}

// 39. Переворот массива
fun reverseArray(array: IntArray): IntArray {
    return array.reversedArray()
}

// 40. Копирование массива
fun copyArray(array: IntArray): IntArray {
    return array.copyOf()
}

// 41. Количество гласных в строке
fun countVowels(input: String): Int {
    return input.count { it.lowercaseChar() in "aeiou" }
}

// 42. Индекс первого вхождения
fun indexOfFirstOccurrence(array: IntArray, element: Int): Int {
    return array.indexOf(element)
}

fun main() {
    // Примеры вызова функций
    println("1. Сумма элементов списка: ${sumOfList(listOf(1, 2, 3, 4, 5))}") // Вывод: 15
    println("2. Разность max и min: ${differenceMaxMin(listOf(10, 2, 8, 4, 6))}") // Вывод: 8
    println("3. Объединенный список: ${mergeLists(listOf(1, 2, 3), listOf(4, 5, 6))}") // Вывод: [1, 2, 3, 4, 5, 6]
    println("4. Прибыльно? ${isProfitable(0.8, 100.0, 50.0)}") // Вывод: true
    println("5. Прибыльно? ${isProfitable2(0.8, 100.0, 50.0)}") // Вывод: true
    println("6. Сумма меньше 100? ${isSumLessThan100(30, 40)}") // Вывод: true
    println("7. Делится на 100? ${isDivisibleBy100(200)}") // Вывод: true
    println("8. Количество кадров: ${calculateFrames(2, 30)}") // Вывод: 3600
    println("9. k^k равно n? ${isKPowerKEqualN(256, 4)}") // Вывод: true (4^4 = 256)
    println("10. Повторенная строка: ${repeatString("Hello", 3)}") // Вывод: HelloHelloHello
    println("11. Результат уравнения '1+1': ${evaluateExpression("1+1")}") // Вывод: 2.0
    println("12. Google: ${generateGoogle(3)}") // Вывод: Goooogle
    greet() // Вывод: Привет, мир!
    println("14. Сумма: ${sum(3, 5)}") // Вывод: 8
    println("15. Большее число: ${maxOfTwo(10, 20)}") // Вывод: 20
    println("16. Четное число? ${isEven(4)}") // Вывод: true
    println("17. Факториал: ${factorial(5)}") // Вывод: 120
    println("18. Простое число? ${isPrime(7)}") // Вывод: true
    println("19. Сумма массива: ${sumArray(intArrayOf(1, 2, 3, 4))}") // Вывод: 10
    println("20. Наибольшее число в массиве: ${maxInArray(intArrayOf(1, 5, 3, 9))}") // Вывод: 9
    println("21. Отсортированный массив: ${sortArray(intArrayOf(5, 3, 8, 1)).joinToString()}") // Вывод: [1, 3, 5, 8]
    println("22. Палиндром? ${isPalindrome("level")}") // Вывод: true
    println("23. Количество символов: ${countCharacters("Hello")}") // Вывод: 5
    println("24. В верхнем регистре: ${toUpperCase("hello")}") // Вывод: HELLO
    println("25. Объединение строк: ${concatenateStrings("Hello, ", "world!")}") // Вывод: Hello, world!
    println("26. Последний элемент: ${lastElement(intArrayOf(1, 2, 3, 4, 5))}") // Вывод: 5
    println("27. Элемент присутствует? ${containsElement(intArrayOf(1, 2, 3, 4), 3)}") // Вывод: true
    println("28. Массив от 1 до N: ${createArrayFrom1ToN(5).joinToString()}") // Вывод: [1, 2, 3, 4, 5]
    println("29. Минимум: ${minMax(intArrayOf(3, 5, 1, 8, 2)).
    first}, Максимум: ${minMax(intArrayOf(3, 5, 1, 8, 2)).second}") // Вывод: Минимум: 1, Максимум: 8
    println("30. Сумма от 1 до N: ${sumFrom1ToN(5)}") // Вывод: 15
    println("31. Температура в Фаренгейтах: ${celsiusToFahrenheit(25.0)}") // Вывод: 77.0
    println("32. Обратный порядок строки: ${reverseString("Hello")}") // Вывод: olleH
    println("33. Элемент по индексу: ${findElementByIndex(intArrayOf(10, 20, 30), 1)}") // Вывод: 20
    println("34. Строка без пробелов: ${removeSpaces("Hello World")}") // Вывод: HelloWorld
    println("35. Сумма первых N натуральных чисел: ${sumFirstNNaturalNumbers(5)}") // Вывод: 15
    println("36. Подстрока присутствует? ${containsSubstring("Hello world", "world")}") // Вывод: true
    println("37. Таблица умножения для 5:")
    printMultiplicationTable(5) // Вывод таблицы умножения для 5
    println("38. Длина строки: ${stringLength("Hello")}") // Вывод: 5
    println("39. Перевернутый массив: ${reverseArray(intArrayOf(1, 2, 3, 4)).joinToString()}") // Вывод: [4, 3, 2, 1]
    println("40. Скопированный массив: ${copyArray(intArrayOf(1, 2, 3)).joinToString()}") // Вывод: [1, 2, 3]
    println("41. Количество гласных в строке: ${countVowels("Hello World")}") // Вывод: 3
    println("42. Индекс первого вхождения элемента: ${indexOfFirstOccurrence(intArrayOf(1, 2, 3, 2), 2)}") // Вывод: 1
}