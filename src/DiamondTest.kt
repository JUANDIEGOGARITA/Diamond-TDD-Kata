import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class DiamondTest {

    @Test
    fun `create a diamond with a single row`() {
        val diamond = Diamond().upTo("A")

        assertThat(diamond[0], `is`("A"))
    }
}