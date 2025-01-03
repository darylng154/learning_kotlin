package learning

/*
*** Control Flow ***
* 1. If Else
*   a. can be used as an expression
*       => no need for ternary operation (condition ? then : else)
*       - else branch is mandatory
* 2. When
*   - similar to switch in Java & C
*   - don't have to cover all possible cases
*       i.e. 'else' is not required like 'default' for switches
*   a. can be used as an expression
*   b. can be used with or without a subject
*       - MUST have an else branch
*       i.e. with: when(x) {...}
*            without: when {... else -> ...}
*   c. Branches
*       i. can use arbitrary expressions
*           i.e. ... { s.toInt() -> print("s encodes x" }
*       ii. can check if value is or isn't in a range or collection
*           - w/ 'in' or '!in'
*       iii. can check if value is a particular type
*           - w/ 'is' or '!is'
*
* 3. For Loop
*   - can loop through a range w/:
*       - '...' : includes both left and right #s
*       - 'until': includes left #, but excludes right #
*       - 'downTo': includes both left and right #s while incrementing downwards
*       - 'step': # of increment or decrement
*
* 4. While Loop
* 5. Do While
*
* 6. Returns & Jumps
*/

fun ifElse()
{
    // 1a. Example
    var isTrue = true
    var char = 'a'

    if(isTrue == true)
    {
        char = 'a'
    }
    else
    {
        char = 'b'
    }

    println("char: $char")

    // expression version:
    isTrue = false

    char = if(isTrue == true) 'a' else if (isTrue == false) 'b'
    else error("Bool was neither true or false")

    println("char: $char")
    printNewSection()
}

fun switch(x: Int)
{
    when(x)
    {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> print("x is not 1 or 2")
    }
}

fun switchExpression(x: Int) : String
{
    return when(x)
    {
        1 -> "x is 1"
        2 -> "x is 2"
        in 3..6 -> "x is btw 3 to 6"
        else -> "x is not 1 or 2 && not in btw 3-6, but $x"
    }
}

fun switchTest()
{
    var x = 1
    switch(x)

    x = 2
    var text = switchExpression(x)
    println(text)

    x = 3
    text = switchExpression(x)
    println(text)

    x = 10
    text = switchExpression(x)
    println(text)

    printNewSection()
}

fun forInRange()
{
    var i  = 0

    for(i in 0..5)
    {
        print("Loop 0 to 5: $i \t")
    }
    println()

    // excludes 6 || from 0 to 5
    for(i in 0 until 6)
    {
        print("Loop 0 to 5: $i \t")
    }
    println()
}

fun forDownTo()
{
    for(i in 3 downTo 0)
        print("Loop 0 to 5: $i \t")
    println()
}

fun forStepBy3()
{
    for(i in 0 until 10 step 3)
        print("Loop 0 to 10 Step By 3: $i \t")
    println()
}