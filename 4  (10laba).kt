fun fizzBuzz(n: Int): List<Any> {
    return (1..n).map {
        when {
            it % 15 == 0 -> "ВизллБизлл"
            it % 3 == 0 -> "Физллл"
            it % 5 == 0 -> "Бизлллл"
            else -> it
        }
    }.toList()
}

fun main() {
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}