fun main(args: Array<String>) {
    val MaxValue = 5
    var ArrayName = arrayOfNulls<String>(MaxValue)
    var ArraySurname = arrayOfNulls<String>(MaxValue)
    var ArrayAge = arrayOfNulls<Int>(MaxValue)
    var i = 0

    println("Enter the name, surname and age of the people")
    while (i < ArrayAge.size) {
        println("${i+1} :")
        print("Name: ")
        ArrayName[i] = readLine()
        print("Surname: ")
        ArraySurname[i] = readLine()
        print("Age: ")
        ArrayAge[i] = readLine()!!.toInt()
        i++
    }

    ArrayAge.sort()

    ArrayAge.forEachIndexed { index, i ->
        if(ArrayAge[index]!! >= 18) println("${ArrayName[index]} ${ArraySurname[index]} an adult and to him ${ArrayAge[index]} age")
        else { print("People are minors!")
            return
        }
    }
}