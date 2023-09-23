public class Triangulo {
    private double base;
    private double altura;

    public double calcularArea(){
        double area;
        area = (base * altura)/2;
        return area;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}
