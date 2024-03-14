fun main() {
    println("Enter the student's score:")
    val score = readLine()?.toDoubleOrNull()

    if (score != null) {
        val grade = calculateGrade(score)
        println("Grade: $grade")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun calculateGrade(score: Double): String {
    return when {
        score in 90.0..100.0 -> "A"
        score in 80.0..89.9 -> "B"
        score in 70.0..79.9 -> "C"

        score in 60.0..69.9 -> "B"
        score in 40.0..59.9 -> "C"
        score in 20.0..39.9 -> "D-"
        score < 10 -> "F"
        else -> "Invalid score"
    }
}
                                                                                                           