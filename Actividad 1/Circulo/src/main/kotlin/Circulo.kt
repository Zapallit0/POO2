import kotlin.math.PI
class Circulo {
    private var radio: Double
    private var color: String

    constructor() {
        radio = 5.0
        color = "azul"
    }

    constructor(radio: Double) {
        this.radio = radio
        color = "azul"
    }

    fun getRadio(): Double {
        return radio
    }

    fun getArea(): Double {
        return radio * radio * PI
    }
}