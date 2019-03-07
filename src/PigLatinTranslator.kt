
class PigLatinTranslator {

    fun translate(input: String): String {
        return input.split("\\s".toRegex()).joinToString(" ") { translatePart(it) }
    }

    fun translatePart(input: String): String {
        val (word, punctuation) = input.partition { it.isLetterOrDigit() }
        val translatedWord = translateWord(word) + punctuation
        return if (input.first().isUpperCase()) capitalize(translatedWord) else translatedWord
    }

    private fun translateWord(word: String) =
        when {
            word.first().isVowel() -> word + "ay"
            word.startsWith("qu") -> word.substringAfter("qu") + "quay"
            else -> {
                val indexOfFirstVowel = word.indexOfFirst { it.isVowel() }
                word.substring(indexOfFirstVowel) + word.substring(0, indexOfFirstVowel) + "ay"
            }
        }

    private fun capitalize(word: String) = word.toLowerCase().capitalize()
}

fun Char.isVowel() = when(this) {
    'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true
    else -> false
}
