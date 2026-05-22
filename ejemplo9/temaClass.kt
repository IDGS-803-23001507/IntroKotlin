class personas{

    var nombre: String =""
    var edad: float = 0

    fun inicialiizar(nombre: String, edad: float){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre: $nombre, Edad: $edad")
    }

    fun esMayor(){
        if(edad >= 18){
            println("Es mayor de edad $nombre")
        }
        if(edad <= 17){
            println("Es menor de edad $nombre")
        }
    }
}

fun main()
{
    val persona1: Persona
    persona1 = persona()
    persona1.inicialiizar("Jose", 18)
    persona1.imprimir()
    persona1.esMayor()

    val persona2: Persona
    persona2 = persona()
    persona2.inicialiizar("Juan", 12)
    persona2.imprimir()
    persona2.esMayor()
}