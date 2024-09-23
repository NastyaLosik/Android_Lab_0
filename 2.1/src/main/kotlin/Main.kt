fun main() {
    var n: Int
    val m= readLine()
    n=m!!.toInt()
    val primes = mutableListOf<Int>()
    var с = 2
    while (primes.size < n) {
        var isPrime = true
        for (i in 2..Math.sqrt(с.toDouble()).toInt()) {
            if (с % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(с)
        }
        с++
    }
    println(primes)
}