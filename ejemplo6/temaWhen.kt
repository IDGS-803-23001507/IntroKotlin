fun main()
{
    println("Ingrese cordenadas x del punto: ")
    val x = readln().toInt()

    println("Ingrese cordenadas y del punto: ")
    val y = readln().toInt()

    when{
        x > 0 && y > 0 -> println("Primer Cuadrante") 
        x < 0 && y > 0 -> println("Segundo Cuadrante") 
        x < 0 && y < 0 -> println("Tercer Cuadrante") 
        x > 0 && y <  0 -> println("Cuarto Cuadrante") 
        else -> println("el punto se encuenta en un eje")
    }
}