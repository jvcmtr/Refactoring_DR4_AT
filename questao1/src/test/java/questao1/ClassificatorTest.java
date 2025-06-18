package questao1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class ClassificatorTest
{
    private final Classificator classifier = new Classificator();
    
    @Test
    void testHigh() {
        var result = classifier.GetClassificationValue(11);
        assertEquals( "ALTO", result);
    }

    @Test
    void testLow() {
        var result = classifier.GetClassificationValue(9);
        assertEquals( "BAIXO", result);
    }

    @Test
    void testMid() {
        var result = classifier.GetClassificationValue(10);
        assertEquals( "MÉDIO", result);
    }
    
    @Test
    void testSpecialCase() {
        var result = classifier.GetClassificationValue(-9999);
        assertEquals( "CASO RARO", result);
    }
}
