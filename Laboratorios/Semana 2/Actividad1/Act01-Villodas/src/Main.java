// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo", new Punto(0, 0), new Punto(4, 0), new Punto(2, 3));
        System.out.println("Área de " + triangulo.getNombre() + ": " + triangulo.calcularArea());

        Triangulo robetocarlos=new Triangulo("triangulo",new Punto(0,0),new Punto(6,0),new Punto(3,5));
        System.out.println(robetocarlos.esRegular());

        Punto xd=new Punto(0,0);
        Punto xd2=new Punto(6,0);
        System.out.println(xd.calcularDistancia(xd2));

    }
}