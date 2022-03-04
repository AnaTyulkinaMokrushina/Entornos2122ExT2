import org.junit.Assert;
import org.junit.Test;


public class TestsProblema1 extends Problema1 {

    @Test
    public void test_problema_1 (){
        Problema1 problema1 = new Problema1();
        String[] strings = problema1.numbers();
        Assert.assertEquals(20, strings.length );
    }

}
