package learning

/*
*** Variables ***
* Keywords:
* 1. val
*   a. immutable & read-only
*       - assigned a value ONCE ONLY
* 2. var
*   a. mutable
*       - can be reassigned
*   b. supports type inference & automatically identifies data type
*
* Init & Declaration
* 1. can only use variables after initializing
* 2. can declare variables at the top level
*   a. must be initialized in same line
*/

/*
*** Numbers ***
* 1. Integer Types
*   - if no explicit type is declared
*       => compiler automatically infers the smallest type that will fit
*          the range
*   a. Byte
*       - 8 bits [-128, 127]
*   b. Short
*       - 16 bits [-32768, 32767]
*   c. Int
*       - 32 bits [-2^31, 2^31 -1]
*   d. Long
*       - 64 bits
*
* 2. Floating Point Types
*   a. Float
*       - 32 bits
*       - 8 Exponent Bits
*       - 6-7 Decimal Digits
*           - will rounded if exceeded
*       - explicit suffix: f or F
*   b. Double
*       - 64 bits
*       - 11 Exponent bits
*       - 15-16 Decimal Bits
*
* 3. Unsigned Integer Types
*   - UByte, UShort, UInt, ULong
*   - literals: u or U tag
*       i.e. val l: ULong = 1u
*
* 4. Booleans
*   - || - logical OR
*   - && - logical AND
*   - ! - logical NOT
*
* 5. Characters
*   i.e. val aChar : Char = 'a'
*   - can explicitly convert Char into Int w/ "digitToInt()"
*
* 6. Strings
*   a. Multiline Strings (""")
*
*/

// Top Level Declaration
val const = true
var name: String = ""

fun keywords()
{
    // Keywords 1a Example
    //    const = false   // cannot be reassigned error

    // Keywords 2B Example
    name = "Alex"
    helloName(name)
    printNewSection()
}

fun integers()
{
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    println("Automatic Inference For Non-explicit Variables: ")
    println("val one = 1 == " + one::class.simpleName)
    println("val threeBillion = 3000000000 == " + threeBillion::class.simpleName)
    println("val oneLong = 1L == " + oneLong::class.simpleName)
    println("val oneByte: Byte == " + oneByte::class.simpleName)
    printNewSection()
}

fun doubles()
{
    val pi: Double = 3.14
    var piF:Float  = 3.14F
    piF = pi.toFloat()

    // inferred from arithmetical operation & overloaded
    val l = 1L + 3 // Long + Int => Long
}

fun strings()
{
    val multiLine = """
        first line
        second line
    """.trimIndent()

    println(multiLine)
    printNewSection()
}