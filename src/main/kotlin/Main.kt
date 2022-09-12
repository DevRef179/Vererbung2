fun main(args: Array<String>) {
    println("Hello World!")
    var warenkorb = Warenkorb()
    warenkorb.addArtikel("shuhe", 199.00)
    println()


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}