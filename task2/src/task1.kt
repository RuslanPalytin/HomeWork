fun main(args: Array<String>) {
    val numberPeople = 5
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

    counter = 0

    while (counter < arrayAges.size) {
        println("${arrayNames[counter]} ${arraySurnames[counter]} an adult and to him(her) ${arrayAges[counter]} age")
        counter++
    }
}