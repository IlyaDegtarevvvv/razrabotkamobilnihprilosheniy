import kotlin.random.Random

fun main() {
    while (true) {
        println("\nВыберите задачу:")
        println("1. Консольный калькулятор")
        println("2. Проверка слова на палиндром")
        println("3. Подсчет очков команды")
        println("4. Поиск минимального числа в списке")
        println("5. Проверка равенства двух чисел")
        println("6. Карточная игра '21'")
        println("0. Выход")
        print("Введите номер задачи: ")

        when (readLine()?.trim()) {
            "1" -> calculator()
            "2" -> palindromeCheck()
            "3" -> calculateTeamPoints()
            "4" -> findMinimumNumber()
            "5" -> checkNumbersEquality()
            "6" -> playBlackjack()
            "0" -> {
                println("Выход из программы.")
                return
            }
            else -> println("Ошибка: выберите корректный номер задачи!")
        }
    }
}

// 1. Консольный калькулятор
fun calculator() {
    print("Введите первое число: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return println("Ошибка ввода!")
    print("Введите оператор (+, -, *, /): ")
    val operator = readLine()
    print("Введите второе число: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return println("Ошибка ввода!")

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Ошибка: деление на ноль"
        else -> "Ошибка: неизвестный оператор"
    }
    println("Результат: $result")
}

// 2. Проверка слова на палиндром
fun palindromeCheck() {
    print("Введите слово: ")
    val word = readLine()?.trim() ?: return println("Ошибка ввода!")
    println(if (word.lowercase() == word.lowercase().reversed()) "Слово '$word' — палиндром" else "Слово '$word' — не палиндром")
}

// 3. Подсчет очков команды
fun calculateTeamPoints() {
    print("Введите количество побед: ")
    val wins = readLine()?.toIntOrNull() ?: return println("Ошибка ввода!")
    print("Введите количество ничьих: ")
    val draws = readLine()?.toIntOrNull() ?: return println("Ошибка ввода!")
    print("Введите количество поражений: ")
    val losses = readLine()?.toIntOrNull() ?: return println("Ошибка ввода!")

    val points = wins * 3 + draws
    println("Команда набрала: $points очков")
}

// 4. Поиск минимального числа в списке
fun findMinimumNumber() {
    print("Введите числа через пробел: ")
    val numbers = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() }
    if (numbers.isNullOrEmpty()) {
        println("Ошибка: список чисел пуст или содержит ошибки!")
        return
    }
    println("Самое маленькое число: ${numbers.minOrNull()}")
}

// 5. Проверка равенства двух чисел
fun checkNumbersEquality() {
    print("Введите первое число: ")
    val a = readLine()?.toIntOrNull() ?: return println("Ошибка ввода!")
    print("Введите второе число: ")
    val b = readLine()?.toIntOrNull() ?: return println("Ошибка ввода!")

    println("Числа равны: ${a == b}")
}

// 6. Карточная игра "21"
fun playBlackjack() {
    var playerScore = 0
    var dealerScore = 0

    println("Игра '21'. Начнем!")

    while (true) {
        print("Взять карту? (да/нет): ")
        when (readLine()?.trim()?.lowercase()) {
            "да" -> {
                val card = Random.nextInt(2, 11) // Карты от 2 до 10
                playerScore += card
                println("Вы вытянули $card. Ваш счет: $playerScore")

                if (playerScore > 21) {
                    println("Перебор! Вы проиграли.")
                    return
                }
            }
            "нет" -> break
            else -> println("Введите 'да' или 'нет'!")
        }
    }

    // Игра дилера
    while (dealerScore < 17) {
        dealerScore += Random.nextInt(2, 11)
    }
    println("Счет дилера: $dealerScore")

    when {
        dealerScore > 21 || playerScore > dealerScore -> println("Вы выиграли!")
        dealerScore == playerScore -> println("Ничья!")
        else -> println("Вы проиграли!")
    }
}