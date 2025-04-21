fun pyramid(n: Int) {
    val maxWidth = 2 * n - 1
    for (i in 1..n) {
        val numHashes = 2 * i - 1
        val numSpaces = (maxWidth - numHashes) / 2
        println(" ".repeat(numSpaces) + "#".repeat(numHashes) + " ".repeat(numSpaces))
    }
}

fun main() {
    pyramid(1)
    println()
    pyramid(2)
    println()
    pyramid(3)
}