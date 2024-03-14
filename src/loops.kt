fun main() {

    //While loop

    var number = 200
    while (number <= 205) {
        println("number is $number")
        number++

    }
    //Decreament
    var l = 100
    while (l >= 95){
        println("number is $l")
        l--
    }
    //Do...While loop
    var num = 20
    do {
        println(num)
        num++

    }while (num <= 25)


    // For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(50,60,12)
    for (x in marks){
        println(x)
    }
    // Range

    for ( numbers in 30 .. 35)
        println(number)
    for (letters in 'a' ..'d')
        println("letter is $letters")


}