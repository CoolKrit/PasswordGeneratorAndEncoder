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

fun verifyPassword(plainPassword: String, hashedPassword: String): Boolean {
    return BCrypt.checkpw(plainPassword, hashedPassword)
}

fun main() {
    val randomPassword = generateRandomPassword(12)
    println("Случайный пароль: $randomPassword")

    val hashedPassword = hashPassword(randomPassword)
    println("Хеш пароля: $hashedPassword")

    val userInputPassword = readLine().toString()
    if (verifyPassword(userInputPassword, hashedPassword)) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}