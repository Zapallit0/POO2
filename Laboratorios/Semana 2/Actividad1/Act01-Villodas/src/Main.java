// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo", new Punto(0, 0), new Punto(4, 0), new Punto(2, 3));
        System.out.println("Área de " + triangulo.getNombre() + ": " + triangulo.calcularArea());
    }
}