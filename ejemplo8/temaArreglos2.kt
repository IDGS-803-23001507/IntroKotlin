fun main(){

val alturas = FloatArray(5)
val suma = 0


for(i in 0..alturas.size()-1){

    println("Ingrese la altura")
    alturas[i] = readln().toFloat()

    suma += alturas[i]
}

val promedio = suma / alturas.size
println("Altura promedio: $promedio")

var altos = 0
val bajos = 0


for(i in 0..alturas.size-1){
    
    if(alturas[i] > promedio)
    altos++
    else
    bajos++
    
    println("La cantidad de personas altas son: $altos")
    println("La cantidad de personas bajas son: $bajos")
}

}