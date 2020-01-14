import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AppTest {
    @Test
    fun `test`(){
        assertThat(watermelon(3)).isEqualTo("수박수")
    }
}