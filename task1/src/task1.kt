fun main(args: Array<String>) {

    print("Enter the name: ")
    val name = readLine()

    print("Enter the surname: ")
    val surname = readLine()

    print("Enter the age: ")
    val age = readLine()!!.toInt()

    var check: Boolean = true

    if (age in 0..14) {
        println("$name $surname do not let in and call the police")
        check = false }
    if (age >= 18) {
        println("$name $surname skip!")
        check = false }
    if (check) println("$name $surname do not let in!")
}