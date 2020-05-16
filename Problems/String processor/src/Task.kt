import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val operand1 = scanner.next()
    val operation = scanner.next()
    val operand2 = scanner.next()

    println(when (operation) {
        "equals" -> operand1 == operand2
        "plus" -> operand1 + operand2
        "endsWith" -> operand1.endsWith(operand2)
        else -> "Unknown operation"
    })
}
