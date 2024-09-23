class Array(private val numbers: IntArray){
    fun sumOfPositives(): Int {
        var sum=0
        for (number in numbers) {
            if (number>0) {
                sum+=number
            }
        }
        return sum
    }
    fun product(): Int {
        var product=1
        for (number in numbers) {
            product*=number
        }
        return product
    }
    fun average(): Double {
        var sum=0.0
        for (number in numbers) {
            sum+=number
        }
        return sum/numbers.size
    }
}
fun main() {
    val array=intArrayOf(1, -2, 3, 5, -6)
    val arr=Array(array)
    println("Сумма положительных элементов: ${arr.sumOfPositives()}")
    println("Произведение элементов массива: ${arr.product()}")
    println("Среднее арифметическое элементов массива: ${arr.average()}")
}