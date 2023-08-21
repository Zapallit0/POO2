fun main(args: Array<String>) {
    val circulo1 = Circulo()
    val circulo2 = Circulo(6.0)

    println("Círculo 1 - Radio: ${circulo1.getRadio()}, Área: ${circulo1.getArea()}")
    println("Círculo 2 - Radio: ${circulo2.getRadio()}, Área: ${circulo2.getArea()}")
}