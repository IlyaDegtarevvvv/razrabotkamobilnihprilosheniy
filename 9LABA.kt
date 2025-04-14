import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    // 1. Генератор случайных чисел
    println("1. 10 случайных чисел от 1 до 100:")
    repeat(10) {
        print("${Random.nextInt(1, 101)} ")
    }
    println("\n")

    // 2. Строковый анализатор
    fun countVowelsConsonants(input: String) {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var vowelCount = 0
        var consonantCount = 0

        input.lowercase().forEach { c ->
            when {
                c in vowels -> vowelCount++
                c.isLetter() -> consonantCount++
            }
        }
        println("2. В строке \"$input\": гласных - $vowelCount, согласных - $consonantCount")
    }
    countVowelsConsonants("Коты крутые")

    // 3. Конвертер валют
    fun convertCurrency(amount: Double, rate: Double) = amount * rate
    println("3. 100 USD в EUR по курсу 0.85: ${convertCurrency(100.0, 0.85)}")

    // 4. Проверка на анаграмму
    fun isAnagram(s1: String, s2: String): Boolean {
        return s1.replace(" ", "").lowercase().toCharArray().sorted() ==
                s2.replace(" ", "").lowercase().toCharArray().sorted()
    }
    println("4. 'listen' и 'silent' - анаграмма? ${isAnagram("listen", "silent")}")

    // 5. Простые числа до N
    fun primesUpTo(n: Int): List<Int> {
        return (2..n).filter { num ->
            (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 }
        }
    }
    println("5. Простые числа до 30: ${primesUpTo(30)}")

    // 6. Сортировка строк
    fun sortStrings(array: Array<String>) = array.sorted()
    println("6. Отсортированный массив: ${sortStrings(arrayOf("коты", "собаки", "голуби"))}")

    // 7. Изменение регистра
    fun swapCase(input: String) = input.map {
        if (it.isLowerCase()) it.uppercase() else it.lowercase()
    }.joinToString("")
    println("7. Инвертированный регистр: ${swapCase("Коты Крутые")}")


    // 8. Игра "Угадай число" - теперь активна!
    fun guessNumber() {
        val secret = Random.nextInt(1, 101)
        var attempts = 0

        println("\n8. Угадайте число от 1 до 100")
        println("Введите 0 для выхода")

        while (true) {
            print("Попытка ${++attempts}: ")
            val input = readlnOrNull()?.toIntOrNull()

            when {
                input == null -> println("Введите число!")
                input == 0 -> {
                    println("Выход. Загаданное число было $secret")
                    return
                }
                input < secret -> println("Больше")
                input > secret -> println("Меньше")
                else -> {
                    println("Победа! Число $secret угадано за $attempts попыток")
                    return
                }
            }
        }
    }
    guessNumber() // Теперь игра запускается автоматически

    // 9. Генератор паролей
    fun generatePassword(length: Int): String {
        val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('!','@','#','$','%')
        return (1..length).map { chars.random() }.joinToString("")
    }
    println("9. Случайный пароль: ${generatePassword(12)}")

    // 10. Самое длинное слово
    fun longestWord(input: String): String {
        return input.split(Regex("[^\\p{L}]")).maxByOrNull { it.length } ?: ""
    }
    println("10. Самое длинное слово: ${longestWord("Коты самые крутые!")}")
}