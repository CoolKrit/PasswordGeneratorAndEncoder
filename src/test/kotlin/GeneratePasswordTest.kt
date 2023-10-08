import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GeneratePasswordTest {
    @Test
    fun `must return the generated password of 12 characters`() {
        val generatedPassword = generateRandomPassword(12)
        assertTrue(generatedPassword.length == 12)
    }
}