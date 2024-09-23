fun main() {
    var c=0
    var s=0
    var n: Int
    do {
        val str = readLine()
        n = str?.toIntOrNull() ?: 0
        if (n == 0) {
            break
        }
        c++
        s+=n
    } while (true)
    println("Количество введенных чисел: $c")
    println("Сумма введенных чисел: $s")
}