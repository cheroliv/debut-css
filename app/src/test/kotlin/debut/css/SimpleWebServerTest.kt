package debut.css

import kotlin.test.Test
import kotlin.test.assertNotNull

class SimpleWebServerTest {
    @Test
    fun appHasAGreeting() {
        assertNotNull(
            SimpleWebServer().greeting,
            "app should have a greeting"
        )
    }
}
