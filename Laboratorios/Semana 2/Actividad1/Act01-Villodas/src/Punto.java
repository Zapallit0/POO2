public class Punto {
    private double coordenada_x;
    private double coordenada_y;
    public Punto(double coordenada_x, double coordenada_y){
        this.coordenada_x=coordenada_x;
        this.coordenada_y=coordenada_y;
    }
    public Punto(){
        coordenada_y=10;
        coordenada_x=5;
    }
    public double getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(double coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public double getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(double coordenada_y) {
        this.coordenada_y = coordenada_y;
    }
    public double calcularDistancia(Punto otroPunto) {
        double dx = this.coordenada_x - otroPunto.coordenada_x;
        double dy = this.coordenada_y - otroPunto.coordenada_y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
