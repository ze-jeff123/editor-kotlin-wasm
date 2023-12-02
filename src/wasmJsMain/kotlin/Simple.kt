import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.dom.appendElement
import kotlinx.dom.appendText
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement

fun main() {
    document.body?.appendElement("div") {
        this.appendText("Hello world213!")
        this.className = "main-container"
        /*appendText("Time in ")

        val output = document.createElement("span")

        val input = appendElement("input") {
            this as HTMLInputElement
            type = "text"
            placeholder="Timezone"

            value = "Europe/Amsterdam"

            addEventListener("change") {
                updateTime(this, output)
            }
        } as HTMLInputElement

        appendText(" is ")
        appendChild(output)

        updateTime(input, output)*/
    }
}
