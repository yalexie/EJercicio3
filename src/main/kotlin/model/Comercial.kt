package model
import model.Empleado

class Comercial : Empleado {

    var comision : Double

    constructor(nombre_p: String, edad_p : Int, salario_p: Double, comision_p:Double): super(nombre_p, edad_p, salario_p){

    }
    init{
        comision = 0.0
    }

    fun plus(edad: Int, comision: Double) {
        if(edad > 30 && comision > 200.0){
            salario += plus
            println( "El salario con la comision es $salario \n")
        }else{
            println(" El salario sin la comision es $salario \n")
        }
    }


}