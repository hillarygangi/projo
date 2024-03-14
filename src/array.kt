fun main() {

    var languages = arrayOf("kotlin","javascript","python","c++")
    println(languages[1])

    //Reassigning a value

    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }
    //Determining whether an element exist or not
    if ("PHP" in languages){
        println("it exists")

    }
    else{
        println("it does not exist")
    }
}