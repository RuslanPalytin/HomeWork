fun main(args: Array<String>) {
    val numberOfPeople = 3
    var arrayOfNames = arrayOfNulls<String>(numberOfPeople)
    var arrayOfSurnames = arrayOfNulls<String>(numberOfPeople)
    var arrayOfAges = arrayOfNulls<Int>(numberOfPeople)

    var check: Int
    var counter = 0

    println("Enter the name, surname and age of the people")
    while (counter < arrayOfAges.size) {
        println("${counter+1} :")
        print("Age: ")
        check = readLine()!!.toInt()
        if (check >= 18) arrayOfAges[counter] = check
        else{ println("The person is a minor, enter the age again!")
            continue
        }
        print("Name: ")
        arrayOfNames[counter] = readLine()
        print("Surname: ")
        arrayOfSurnames[counter] = readLine()
        counter++
    }

    counter = 0

    while (counter < arrayOfAges.size) {
        println("${arrayOfNames[counter]} ${arrayOfSurnames[counter]} an adult and to him(her) ${arrayOfAges[counter]} age")
        counter++
    }
}