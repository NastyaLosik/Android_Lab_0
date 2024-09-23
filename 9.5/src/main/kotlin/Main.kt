fun main() {
    val phoneBook = mapOf(
        "Ivan" to "+79372893567",
        "Petr" to "+13456934567",
        "Eva" to "+48968452306",
        "Alina" to "+73859230562"
    )
    val countryCode = "+7"
    println(phoneBook.filter { (_, phoneNumber) -> phoneNumber.startsWith(countryCode) })
}