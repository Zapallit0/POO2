abstract class FiguraGeometrica {
    private String nombre;
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea();
    public abstract boolean esRegular();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

}
