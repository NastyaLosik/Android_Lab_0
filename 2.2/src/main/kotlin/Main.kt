fun main() {
    println("используя цикл for\n")
    val arr = arrayOf(2, 5, 6, 3, 5, 7, 12, 7, 89, 5, 9)
    for (i in 1 until arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            println(arr[i])
        }
    }
    println("используя цикл while\n")
    var i = 1
    while (i < arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            println(arr[i])
        }
        i++
    }
    println("используя оператор forEach\n")
    arr.forEachIndexed { index, value ->
        if (index > 0 && index < arr.size - 1) {
            if (value > arr[index - 1] && value > arr[index + 1]) {
                println(value)
            }
        }
    }
}