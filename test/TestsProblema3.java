import org.junit.Assert;
import org.junit.Test;

public class TestsProblema3 extends Problema3 {
    @Test
    public void test_problema_1() {
        Problema3 problema3 = new Problema3();
        int numero_inicial = 20;
        String strings = problema3.numbers(numero_inicial);
        Assert.assertEquals("nullFizzBuzz12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", strings);
    }
}
