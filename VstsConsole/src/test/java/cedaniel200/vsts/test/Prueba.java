package cedaniel200.vsts.test;

import org.junit.Assert;
import org.junit.Test;

public class Prueba extends BaseTest {

    @Test
    public void restaTest(){
        boolean resultado = (2 - 2 == 5);
        Assert.assertTrue(resultado);
    }

    @Test
    public void stringTest(){
        Assert.assertEquals("Hola", "Cesar");
    }

}
