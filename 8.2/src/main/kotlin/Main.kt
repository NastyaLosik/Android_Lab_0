fun main() {
    val words= listOf("word", null, "one", "two", null)
    println("оператор if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        }
    }
    println("\nоператор безопасного вызова ?:")
    for (word in words) {
        println(word?.uppercase() ?: "empty")
    }
    println("\nфункция let: ")
    for (word in words) {
        word?.let { println(it.uppercase()) }
    }
    println("\nЭлвис-оператор ?: ")
    for (word in words) {
        println((word ?: "empty").uppercase())
    }
}