package sumBetweenTwoInteger.kotlin.saj

import org.hamcrest.MatcherAssert.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun `sum between two integer`(){
        assertThat(sumBetweenTwoInteger(3,5))
    }
}
