fun main() {
    val a= listOf(2, 4, 7, -2, 0, -12)
    println(a.map { if (it>0) -it else it })
}