fun generateRandomPassword(length: Int): String {
    val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?`~"
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun main() {
    val randomPassword = generateRandomPassword(12)
    println("Случайный пароль: $randomPassword")
}