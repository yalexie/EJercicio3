package model

open class Empleado {

    var nombre : String
    var edad : Int
    var salario : Double
    val plus : Int

    init {
        nombre = ""
        edad = 0
        salario = 0.0
        plus = 300
    }

    constructor(nombre_p: String, edad_p : Int, salario_p: Double){
        this.nombre = nombre_p
        this.edad = edad_p
        this.salario = salario_p
    }




}