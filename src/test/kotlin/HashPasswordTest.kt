import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mindrot.jbcrypt.BCrypt

class HashPasswordTest {
    @Test
    fun `password hashing test`() {
        val password = generateRandomPassword(12)
        val hashedPassword = hashPassword(password)
        assertTrue(BCrypt.checkpw(password, hashedPassword))
    }
}