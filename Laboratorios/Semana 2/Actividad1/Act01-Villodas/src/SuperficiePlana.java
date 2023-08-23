import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {
    private List<FiguraGeometrica> figuras;

    public SuperficiePlana() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void calcularAreasDeFiguras() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }
    }
}
