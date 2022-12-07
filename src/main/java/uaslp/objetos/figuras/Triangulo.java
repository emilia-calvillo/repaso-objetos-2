package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private String description;
    private String Name;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
        super("Triangulo");
        this.description = "Cualquier triangulo";
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Triangulo(String description,String Name){
        super(Name);
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
}
