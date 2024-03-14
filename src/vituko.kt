fun main() {
    println("Welcome to Kotlin Calculator")
    println("Please enter your operation:")
    val operation = readLine()
    println("Please enter two numbers:")
    val num1 = readLine()?.toDoubleOrNull()
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid input. Please enter valid numbers.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Cannot divide by zero.")
                return
            }
        }
        else -> {
            println("Invalid operation.")
            return
        }
    }

    println("Result: $result")
}