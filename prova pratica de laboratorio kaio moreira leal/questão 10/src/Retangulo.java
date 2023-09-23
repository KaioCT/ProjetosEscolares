public class Retangulo implements Shape{
    private double base;
    private double altura;

    public double area(){
        double area = base*altura;
        return area;
    }

    public double perimetro(){
        double perimetro = 2*(base+altura);
        return perimetro;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo [area=" + area() + ", perimetro=" + perimetro() + "]";
    }

    
}
