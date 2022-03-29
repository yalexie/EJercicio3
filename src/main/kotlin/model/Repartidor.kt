package model
import model.Empleado


class Repartidor : Empleado {

    var zona : String

    constructor(nombre_p: String, edad_p : Int, salario_p: Double, zona_p:String): super(nombre_p, edad_p, salario_p)

    init{
       zona = ""
    }

    fun plus(edad: Int, zona: String) {
        if(edad < 25 && zona == "Zona 3"){
            salario += plus
            println( "El salario con el PLus es: $salario \n")
        }else{
            println("El salario sin el Plus es: $salario \n")
        }
    }




}