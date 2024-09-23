open class Vehicle(var speed: Int, var name: String){
    open fun start(){
        println("$name начал движение со скоростью $speed км/ч")
    }
    open fun stop(){
        println("$name остановился")
    }
}
class Boat(speed: Int, name: String):Vehicle(speed, name){
    override fun start(){
        println("$name начал движение со скоростью $speed км/ч")
    }
    override fun stop(){
        println("$name остановился")
    }
}
class Plane(speed: Int, name: String):Vehicle(speed, name){
    override fun start(){
        println("$name взлетел со скоростью $speed км/ч")
    }
    override fun stop(){
        println("$name приземлился")
    }
}
class Tank(speed: Int, name: String):Vehicle(speed, name){
    override fun start(){
        println("$name начал движение со скоростью $speed км/ч")
    }
    override fun stop(){
        println("$name остановился")
    }
}
fun main() {
    val vehicle=Vehicle(245, "Mercedes")
    val boat=Boat(12, "Boat")
    val plane=Plane(321, "Boing-333")
    val tank=Tank(76,"Tank")
    vehicle.start()
    plane.start()
    vehicle.stop()
    tank.start()
    tank.stop()
    boat. start()
    boat.stop()
    plane.stop()

}