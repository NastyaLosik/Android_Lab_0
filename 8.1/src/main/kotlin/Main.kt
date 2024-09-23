fun main() {
    val a: Double
    val b: Double
    val c: String
    val d: Double
    a= readLine()!!.toDouble()
    b= readLine()!!.toDouble()
    c= readLine().toString()
    if (c=="+"){
        d=a+b
        println(d)
    } else if (c=="-"){
        d=a-b
        println(d)
    } else if (c=="*") {
        d=a*b
        println(d)
    } else if (c=="/"){
        d=a/b
        println(d)
    }else{
        println("Нет такого знака")
    }
}