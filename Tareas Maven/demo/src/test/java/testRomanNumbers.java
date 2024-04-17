import org.junit.Test;
import com.example.RomanNumbers;
import static org.junit.Assert.assertEquals;

public class testRomanNumbers {
        @Test
    public void numberTest(){
        RomanNumbers number1 = new RomanNumbers();
        String result =  number1.convertToRomanNumbers(500);
        assertEquals("D", result);

    }
  @Test
    public void number2Test(){
        RomanNumbers number2 = new RomanNumbers();
        String result2 =  number2.convertToRomanNumbers(10);
        assertEquals("X", result2);


    }
@Test
    public void number3Test(){
    RomanNumbers number3 = new RomanNumbers();
    String result3 =  number3.convertToRomanNumbers(2);
    assertEquals("II", result3);
    }

}
