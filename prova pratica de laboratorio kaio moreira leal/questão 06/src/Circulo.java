public class Circulo {
    private double raio;

    public double calcularArea(){
        double area = Math.PI * (raio*raio);
        return area;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
}
