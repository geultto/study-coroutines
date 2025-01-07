package couroutines.p15

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import kotlin.concurrent.thread
import kotlin.test.Test

class SampleTest {

    @Test
    @Disabled("WARNING: too slow")
    fun ex1() {
        repeat(100_000) {
            thread {
                Thread.sleep(1000L)
                print(".")
            }
        }
    }

    @Test
    @DisplayName("coroutines 짱짱")
    fun ex2() {
        runBlocking {
            repeat(100_000) {
                launch {
                    delay(1000L)
                    print(".")
                }
            }
        }
    }
}
