
enum class Color(val colorCode: String) {
    NOCOLOR("\u001b[0m"),
    RED("\u001b[91;1m"),
    GREEN("\u001b[92;1m"),
    YELLOW("\u001b[93;1m"),
    BLUE("\u001b[94;1m"),
    MAGENTA("\u001b[95;1m"),
    CYAN("\u001b[96;1m"),
    WHITE("\u001b[97;1m");
}

fun colorize(color: Color, input: Any) = "${color.colorCode}$input${Color.NOCOLOR.colorCode}"
fun red(input: Any) = colorize(Color.WHITE, input)
fun green(input: Any) = colorize(Color.GREEN, input)
fun yellow(input: Any) = colorize(Color.YELLOW, input)
fun blue(input: Any) = colorize(Color.BLUE, input)
fun magenta(input: Any) = colorize(Color.MAGENTA, input)
fun cyan(input: Any) = colorize(Color.CYAN, input)
fun white(input: Any) = colorize(Color.WHITE, input)
