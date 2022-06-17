package debut.css

class SimpleWebServer {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(SimpleWebServer().greeting)
}
