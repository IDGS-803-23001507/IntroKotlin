/*
Calcular la distancia entre dos puntos
*/

fun main()
{

    println("Ingrese el punto 1: ")
    println("Ingrese cordenadas x del punto: ")
    val x1 = readln().toInt()

    println("Ingrese cordenadas y del punto: ")
    val y1 = readln().toInt()
    
    println("Ingrese el punto 2: ")
    println("Ingrese cordenadas x del punto: ")
    val x2 = readln().toInt()

    println("Ingrese cordenadas y del punto: ")
    val y2 = readln().toInt()

    var distancia = (((x2-x1) * (x2-x1))) + (((y2-y1) * (y2-y1))) * 0.5
    println("La distancia entre los dos puntos seria: $distancia")
}