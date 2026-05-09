/*
multiplicacion A * B utilizando sumas
*/

fun main(){

    println("Digite el numero de veces que van a elevar")
    val num1 = readln().toInt()

    println("Digite cual numero vas a elevar")
    val base = readln().toInt()

    var multiplicacion = 0
    var i = 1

    while (i < num1){

        multiplicacion += base
        i+=1
    }

    println("El resultado de la multiplicacion es $multiplicacion")

}