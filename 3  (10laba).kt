fun caesarCipher(text: String, shift: Int): String {
    return text.map { char ->
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 'A' else 'a'
            val offset = (char - base + shift) % 26
            (base + if (offset < 0) offset + 26 else offset).toChar()
        } else char
    }.joinToString("")
}

fun main() {
    println(caesarCipher("Hello, World!", 3))
    println(caesarCipher("Khoor, Zruog!", -3))
    println(caesarCipher("ABCXYZ", 5))
}