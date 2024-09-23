fun main() {
    val a=readLine()!!.toInt()
    val b=readLine()!!.toInt()
    val c=readLine()!!.toInt()
    println("Квадратное уравнение: ${a}x² + ${b}x + ${c} = 0")
    println("Дискриминант: ${discriminant(a, b, c)}")
    println("Количество корней: ${rootsNumber(a, b, c)}")
    println("Корни уравнения:")
    quadraticRoot(a, b, c)
}
fun sqr(n: Int): Int {
    return n*n
}
fun discriminant(a: Int, b: Int, c: Int): Int {
    return sqr(b)-4*a*c
}
fun rootsNumber(a: Int, b: Int, c: Int): Int {
    val d=discriminant(a, b, c)
    return when {
        d>0 -> 2
        d==0 -> 1
        else -> 0
    }
}
fun quadraticRoot(a: Int, b: Int, c: Int) {
    val d=discriminant(a, b, c)
    if (d>=0) {
        val x1=(-b+Math.sqrt(d.toDouble()))/(2*a.toDouble())
        val x2=(-b-Math.sqrt(d.toDouble()))/(2*a.toDouble())
        if (d==0) {
            println("x= $x1")
        } else {
            println("x1= $x1")
            println("x2= $x2")
        }
    } else {
        println("Уравнение не имеет действительных корней")
    }
}