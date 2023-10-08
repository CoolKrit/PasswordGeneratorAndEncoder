import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class VerifyPasswordTest {
    @Test
    fun testVerifyPassword() {
        val password = generateRandomPassword(12)
        val hashedPassword = hashPassword(password)
        assertTrue(verifyPassword(password, hashedPassword))
    }
}