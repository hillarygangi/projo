fun main() {
    //Break statement
    for (x in 50 ..55){
        if (x == 54){
            break
        }
        println(x)
    }
    //Continue statement
    for (characters in 'd'..'h'){
        if (characters =='e'){
            continue
        }
        println("Character is $characters")
    }



}