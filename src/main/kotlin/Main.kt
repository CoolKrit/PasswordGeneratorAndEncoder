import org.mindrot.jbcrypt.BCrypt

fun generateRandomPassword(length: Int): String {
    val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?`~"
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun hashPassword(password: String): String {
    val salt = BCrypt.gensalt(12)
    return BCrypt.hashpw(password, salt)
}

fun main() {
    val randomPassword = generateRandomPassword(12)
    println("Случайный пароль: $randomPassword")
}