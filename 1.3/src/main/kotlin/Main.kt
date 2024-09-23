fun main() {
    val A=(0..10).random()
    var B: Int?
    do{
        val str = readLine()
        B = str!!.toInt()
        if (B > A) {
            println("Много")
        } else if (B < A) {
            println("Мало")
        } else {
            println("Угадал")
        }
    }while (B!=A)
}