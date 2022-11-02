import org.junit.Assert.*
import org.junit.Test
import ru.netology.comissim

class MainKtTest {

    @Test
    fun comissim() {
        val card = "VK Pay"
        var summMonth = 100
        val mount = 1_000_000

        val result = comissim(card,summMonth, mount)

        assertEquals("MasterCard",0, result)
    }
}