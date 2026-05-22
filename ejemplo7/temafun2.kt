fun mostrarPerimetro(lado: Int){

    val perimetro = lado * 4
    println("el perimetro es: $perimetro")

}

fun mostrarSuperficie(lado: Int){

    val superficie = lado * lado
    println("la superficie es: $superficie")

}

fun main(){
    println("Ingrese el valor de un lado de un cuadrado" )
    val la =readln().toInt()

    println("Quiere calcula el perimetro o la superficie {ingresar texto perimetro/superficie}" )
    val respuesta =readln()

    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }

}