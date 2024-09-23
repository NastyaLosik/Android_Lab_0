fun main() {
    var concat  ={ a: String, b: String, c: String -> String
        listOf(a, b, c).sortedBy { it.length }.joinToString("")
    }
    val lambdaResult = concat (readLine()!!.toString(), readLine()!!.toString(), readLine()!!.toString())
    println(lambdaResult)
}