package basic


fun main(args: Array<String>) {

    //String template
    val i = 10
    val x = "i = $i"
    println(x)
    val s = "abc"
    val str = "${s.length} is length of $s string"
    val price = """${'$'}9.99"""
    println(str+price)

    //underscores in numeric literals
    val oneMillion = 1_000_000
    println(oneMillion)

    //what is diferrence between Int and Int?
    val k: Int? = null
    println(k)

    //representation
    val rep: Int = 100
    println(rep === rep)
    val boxedRep: Int? = rep
    val anotherBoxedRep: Int? =rep
    println(boxedRep === anotherBoxedRep)


    //explain why this case has the different result from the above one.
    val a: Int = 10000
    println(a === a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)

    //equality
    val a2: Int = 10000
    println(a2 == a2) // Prints 'true'
    val boxedA2: Int? = a2
    val anotherBoxedA2: Int? = a2
    println(boxedA2 == anotherBoxedA2) // Prints 'true'

    //explicit conversion


    //implicit conversion
    val m1: Int = 10
    val m2: Long = m1.toLong()
    println(m2)

    //operations
    var ope = 1 shl 3
    println(ope)

}