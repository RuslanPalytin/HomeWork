fun main(args: Array<String>) {
    val numberPeople = 3
    var arrayNames = arrayOfNulls<String>(numberPeople)
    var arraySurnames = arrayOfNulls<String>(numberPeople)
    var arrayAges = arrayOfNulls<Int>(numberPeople)

    var age: Int
    var name: String
    var surname: String
    var counter = 0

    println("Enter the name, surname and age of the people")
    while (counter < arrayAges.size) {
        println("${counter+1} :")
        print("Name: ")
        name = readLine().toString()
        print("Surname: ")
        surname = readLine().toString()
        print("Age: ")
        age = readLine()!!.toInt()
        if (age >= 18) {
            arrayNames[counter] = name
            arraySurnames[counter] = surname
            arrayAges[counter] = age
        } else {
            println("The person is a minor, enter the age again!")
            continue
        }
        counter++
    }

    Print(arrayNames, arraySurnames, arrayAges)
}

fun Print(arrayNames: Array<String?>, arraySurnames: Array<String?>, arrayAges: Array<Int?>) {
    var i = 0

    while (i < arrayAges.size) {
        println("${arrayNames[i]} ${arraySurnames[i]} an adult and to him(her) ${arrayAges[i]} age")
        i++
    }
}