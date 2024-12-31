package learning

fun printNewSection()
{
    println("---------------------------------------------------------" + '\n')
}

fun helloWorld()
{
    println("Hello World")
}

fun helloName(name:String)
{
    println("Hello $name")
}

fun readStdIn(): String
{
    print("Enter text: ")
    val input = readln()
    return input
}