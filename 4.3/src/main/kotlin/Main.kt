class Vector(val x: Double, val y: Double, val z: Double){
    fun VectorLength(): Double{
        return Math.sqrt(x * x + y * y + z * z)
    }
    infix fun ScalarProduct(other: Vector): Double{
        return x*other.x + y*other.y +z*other.z
    }
}
fun ScalarProduct(vector1: Vector, vector2: Vector): Double{
    return vector1.x*vector2.x + vector1.y*vector2.y + vector1.z*vector2.z
}
fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)
    println("Длина вектора 1: ${vector1.VectorLength()}")
    println("Длина вектора 2: ${vector2.VectorLength()}")
    println("Скалярное произведение (infix): ${vector1 ScalarProduct  vector2}")
    println("Скалярное произведение (функция): ${ScalarProduct(vector1, vector2)}")

}