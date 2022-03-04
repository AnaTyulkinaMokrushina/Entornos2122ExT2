import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestsProblema2 extends Problema2{
    @Test
    public void problema2_con_cualquier_rango(){
        Problema2 problema2 = new Problema2();
        int numero_inicial = 20;
        String strings = problema2.numbers(numero_inicial);
        Assert.assertEquals("nullFizzBuzz12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19", strings);

    }
}
