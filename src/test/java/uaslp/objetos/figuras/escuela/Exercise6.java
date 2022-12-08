package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:
    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX
    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"
     */

    /*Para este ejercicio un compañero fue amable de ayudarme para poder entender
    Mockito y a utilizar mock.
    Este es un framework que permite la creación de objetos dobles para pruebas.
    */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void test_a_menor_que_b(){

        int a = 12;
        int b = 15;
        String mensaje = "a es menor que b";  //c

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        algoritmoX.algoritmoACubrir(a,b,mensaje);
        Mockito.verify(dependencia2).print(a,mensaje);
        Mockito.verify(dependencia3).recover();
    }

    @Test
    public void test_a_igual_que_b(){

        int a = 24;
        int b = 24;
        String mensaje = "a es igual que b";  //c

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(a,b,mensaje);
        Mockito.verify(dependencia1).save(mensaje);
        Mockito.verify(dependencia3).recover();
    }


    @Test
    public void test_a_mayor_que_b(){

        int a = 36;
        int b = 15;
        String mensaje = "a es mayor que b";   //c

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(a,b,mensaje);
        Mockito.verify(dependencia3).send(a,b);
        Mockito.verify(dependencia3).recover();
    }
}
