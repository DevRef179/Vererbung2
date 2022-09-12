fun main(args: Array<String>) {
    println("Hello World!")
    var warenkorb = Warenkorb()
    warenkorb.addArtikel("shuhe", 199.00)
    warenkorb.addArtikel("Hose", 19.00)
    warenkorb.addArtikel("Hut", 399.00)
    warenkorb.addArtikel("Handshuhe", 27.00)

    val myList = listOf<Artikel>()
    for (counter in myList.indices){
        print(myList[counter].name +" 2")
        print(myList[counter].preis )

        println()
    }



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("${args.joinToString()}")
}