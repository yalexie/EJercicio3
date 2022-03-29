import model.Comercial
import model.Repartidor


fun main(args: Array<String>) {

    var r1 = Repartidor("Carlos",40, 50.000, "Alajuela")
    var r2 = Repartidor("Maria",21, 61.000, "Zona 3")

    var c1 = Comercial("Juan",50, 76.000, 250.0)
    var c2 = Comercial("Jimena",34, 30.000, 50.0)

    println("Repartidor 1 \n")
    r1.plus(40,"Alajuela")

    println("Repartidor 2 \n")
    r2.plus(21,"Zona 3")

    println("Comercial 1 \n")
    c1.plus(50,250.0)

    println("Comercial 2 \n")
    c2.plus(40,50.0)







    println("Program arguments: ${args.joinToString()}")
}