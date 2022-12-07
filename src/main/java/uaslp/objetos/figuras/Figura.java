package uaslp.objetos.figuras;

public class Figura extends DrawableItem{
    private String Name;

    public Figura(String Name){
        this.Name=Name;
    }

    public String getName() {
        return Name;
    }
}
