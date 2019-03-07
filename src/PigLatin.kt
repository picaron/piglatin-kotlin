
import kotlin.test.assertEquals

val pigLatinTranslator = PigLatinTranslator()
val suiteReport = SuiteReport()

fun main() {
    //1. As a user I can enter a phrase "hello" and see it translated to Pig Latin "ellohay"!
    test("hello", "ellohay")

    //2. As a user I can enter a phrase "hello world" and see it translated to Pig Latin "ellohay orldway"! 
    test("hello world", "ellohay orldway")

    //3. As a user I can enter a phrase "Hello World" and see it translated to Pig Latin "Ellohay Orldway"!
    test("Hello World", "Ellohay Orldway")

    //4. As a user I can enter a phrase "Hello, world!" and see it translated to Pig Latin "Ellohay, orldway!"!
    test("Hello, world!", "Ellohay, orldway!")

    //5. As a user I can enter a phrase "eat apples" and see it translated to Pig Latin "eatay applesay"!
    test("eat apples", "eatay applesay")

    //6. As a user I can enter a phrase "dragons strike quickly" and see it translated to Pig Latin "agonsdray ikestray icklyquay"
    test("dragons strike quickly", "agonsdray ikestray icklyquay")

    //additional tests
    test("computer", "omputercay")
    test("Slander", "Anderslay")
    test("spa", "aspay")
    test("pray", "aypray")
    test("yesterday", "esterdayyay")
    test("I am happy", "Iay amay appyhay")

    suiteReport.printReport()
}

fun test(input: String, expectedOutput: String) {
    val actualOutput = pigLatinTranslator.translate(input)
    try {
        assertEquals(expectedOutput, actualOutput)
        println("✅ translate(${white(input)}) returned ${green(actualOutput)} as expected")
        suiteReport.recordSuccessful()
    } catch (e: Throwable) {
        println("❌ translate(${white(input)}) returned ${red(actualOutput)} but expected output was: ${yellow(expectedOutput)}")
        suiteReport.recordFailed()
    }
}
