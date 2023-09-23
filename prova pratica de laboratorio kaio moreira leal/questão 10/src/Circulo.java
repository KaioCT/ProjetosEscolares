public class Circulo implements Shape{

    private double raio;

    public double area(){
        double area = Math.PI * (raio*raio);
        return area;
    }

    public double perimetro(){
        double perimetro = 2*Math.PI*raio;
        return perimetro;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    @Override
    public String toString() {
        return "Retangulo [area=" + area() + ", perimetro=" + perimetro() + "]";
    }
}
