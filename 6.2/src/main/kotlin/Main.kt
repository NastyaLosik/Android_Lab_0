interface Figure{
    fun square(): Double
    fun perimeter(): Double
}
class Square(private val side:Double): Figure{
    override fun square(): Double{
        return side*side
    }
    override fun perimeter(): Double{
        return side*4
    }
}
class Circle(private val radius:Double): Figure{
    override fun square(): Double{
        return Math.PI*radius*radius
    }
    override fun perimeter(): Double{
        return 2*Math.PI*radius
    }
}
class Triangle(private val side1:Double, private val side2:Double, private val side3:Double, private val base:Double, private val height:Double): Figure{
    override fun square(): Double{
        return 0.5*base*height
    }
    override fun perimeter(): Double{
        return side1+side2+side3
    }
}
fun main() {
    val square=Square(3.4)
    val circle=Circle(56.6)
    val triangle=Triangle(5.8, 5.4, 3.7, 5.4, 3.9)
    println("Площадь квадрата: ${square.square()}, периметр квадрата: ${square.perimeter()}")
    println("Площадь окружности: ${circle.square()}, периметр окружности: ${circle.perimeter()}")
    println("Площадь треугольника: ${triangle.square()}, периметр треугольника: ${triangle.perimeter()}")
}