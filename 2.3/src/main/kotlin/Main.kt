fun main() {
    val array = intArrayOf(2, 5, 1, 8, 3)
    var product = 1
    var min = array[0]
    var max = array[0]

    println("Используя цикл for:")
    for (i in array.indices) {
        product *= array[i]
        min = minOf(min, array[i])
        max = maxOf(max, array[i])
    }
    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")

    println("\nИспользуя цикл while:")
    product = 1
    min = array[0]
    max = array[0]
    var i = 0
    while (i < array.size) {
        product *= array[i]
        min = minOf(min, array[i])
        max = maxOf(max, array[i])
        i++
    }
    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")

    println("\nИспользуя функцию reduce():")
    product = array.reduce { acc, curr -> acc * curr }
    min = array.min()
    max = array.max()
    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")

    println("\nИспользуя оператор forEach:")
    product = 1
    min = array[0]
    max = array[0]
    array.forEach { element ->
        product *= element
        min = minOf(min, element)
        max = maxOf(max, element)
    }
    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")

    println("\nИспользуя функции min() и max():")
    product = array.reduce{ acc, curr -> acc * curr }
    min = array.min()
    max = array.max()
    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}