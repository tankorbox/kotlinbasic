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
    val k: Int? = oneMillion
    println(k===oneMillion)
}