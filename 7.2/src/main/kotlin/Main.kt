import kotlin.math.abs
class Point(var x: Double, var y: Double){
    override fun toString(): String{
        return "текущие координаты ${x}, ${y}"
    }
}
enum class Command(){
    UP,
    DOWN,
    LEFT,
    RIGHT
}
class Turtle(){
    fun move(point: Point, command: Command){
        when(command){
            Command.UP -> point.y++
            Command.DOWN -> point.y--
            Command.RIGHT -> point.x++
            Command.LEFT -> point.x--
        }
        println("Произведено перемещение по оси Х на ${abs(point.x - point.x)}, по оси У на ${abs(point.y - point.y)}")
    }
}
fun main() {
    val point = Point(0.0, 0.0)
    val turtle = Turtle()

    println("Начальное положение: $point")

    turtle.move(point, Command.UP)
    println("Новое положение: $point")

    turtle.move(point, Command.RIGHT)
    println("Новое положение: $point")

    turtle.move(point, Command.DOWN)
    println("Новое положение: $point")

    turtle.move(point, Command.LEFT)
    println("Новое положение: $point")
}