fun main() {
    var a= readLine()
    val a1 = Integer.parseInt(a)
    var sum = 0
    var temp = a1
    while (temp > 0) {
        val digit = temp % 10
        sum += digit
        temp /= 10
    }

    println(sum)
}