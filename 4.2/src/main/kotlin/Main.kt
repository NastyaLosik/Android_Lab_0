class Array(private val numbers: IntArray){
    fun doubleEvenTripleOdd(): IntArray {
        return numbers.map {
            if (it%2==0) {
                it*2
            } else {
                it*3
            }
        }.toIntArray()
    }
    val max: Int
        get() = numbers.maxOrNull() ?: Int.MIN_VALUE
    val min: Int
        get() = numbers.minOrNull() ?: Int.MAX_VALUE
    val sum: Int
        get() = numbers.sum()
}
fun main() {
    val array = intArrayOf(2, 5, 1, 8, 3)
    val numberArray = Array(array)
    println("Удвоенные четные, утроенные нечетные: ${numberArray.doubleEvenTripleOdd().contentToString()}")
    println("Максимальный элемент: ${numberArray.max}")
    println("Минимальный элемент: ${numberArray.min}")
    println("Сумма элементов: ${numberArray.sum}")
}