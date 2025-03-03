fun main() {
    // 1. Создайте пустой список строк и добавьте в него пять элементов с помощью метода add
    val stringList = mutableListOf<String>()
    stringList.add("Алекбер")
    stringList.add("Илья")
    stringList.add("Тема")
    stringList.add("Соня")
    stringList.add("Алексей")

    // 2. Проверьте, содержится ли заданное значение в списке строк, и выведите результат.
    val searchValue = "Алексей"
    println("Содержится ли '$searchValue' в списке? ${stringList.contains(searchValue)}")

    // 3. Переберите все элементы списка целых чисел с помощью цикла for и выведите каждый элемент.
    val intList = mutableListOf(5, 3, 8, 1, 4, -2, 0)
    println("Элементы списка целых чисел:")
    for (number in intList) {
        println(number)
    }

    // 4. Отсортируйте список целых чисел в порядке возрастания и выведите отсортированный список.
    val sortedIntList = intList.sorted()
    println("Отсортированный список: $sortedIntList")

    // 5. Создайте новый список, содержащий только четные числа из исходного списка целых чисел.
    val evenNumbers = intList.filter { it % 2 == 0 }
    println("Четные числа: $evenNumbers")

    // 6. Подсчитайте количество элементов в списке строк, которые начинаются с заданной буквы.
    val letter = 'A'
    val countStartingWithLetter = stringList.count { it.startsWith(letter, ignoreCase = true) }
    println("Количество элементов, начинающихся с '$letter': $countStartingWithLetter")

    // 7. Изменить знак для всех положительных элементов списка.
    val negatedList = intList.map { if (it > 0) -it else it }
    println("Список после изменения знака положительных элементов: $negatedList")

    // 8. Из имеющегося списка целых чисел, сформировать список их квадратов.
    val squaredList = intList.map { it * it }
    println("Список квадратов чисел: $squaredList")
}