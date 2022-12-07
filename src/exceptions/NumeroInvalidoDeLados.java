package uaslp.objetos.exceptions;

public class NumeroInvalidoDeLados extends RuntimeException{

    public String getMessage(){
        return "Número de lados válido a partir de 5";
    }
}
