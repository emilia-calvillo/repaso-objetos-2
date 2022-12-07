package uaslp.objetos.figuras;
import uaslp.objetos.exceptions.NumeroInvalidoDeLados;

public class PoligonoRegular extends Figura {
    private int numeroDeLados;  //6
    private double lado;      //10

    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados{
        super("Poligono Regular");
        if(numeroDeLados <= 3){
            throw new NumeroInvalidoDeLados();
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return ((numeroDeLados*lado)*8.6602540378443866)/2;   //8.660... apotema de un hexágono con lado 10
    }

    public double getLado() {
        return lado;
    }
}

//Los unit test solo se pasarían específicamente con un hexágono de lado=10
//Una alternativa para poder probar cualquier polígono regular y cualquier tamaño de lado,
//es calculando el apotema y el perímetro.
//Para calcular el apotema sería necesario también calcular el ángulo que se forma entre el lado y el centro