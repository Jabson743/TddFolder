import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Calculator {

       @Test
       public void testThatCalculatorCanAddTwoPositiveNumbers() {

       // given: Talks about what you need to check;
       CalculatorApp calculator = new CalculatorApp();

       // when: Talks about the invoking process;
       int result = calculator.add(2, 4);

       // assert: Talks about the actual functionality to check;
       assertEquals(6, result);
  }

      @Test
      public void testThatCalculatorThatCanSubtractTwoPositiveNumbers() {
      // given: 
      CalculatorApp calculator = new CalculatorApp();

     //when: 
     int result = calculator.subtract(7, 4);
     
     //assert:
     assertEquals(3, result);
    }

     @Test
     public void testThatCalculatorThatCanMultiplyTwoPositiveNumbers() {
     //given:
     CalculatorApp calculator = new CalculatorApp();

     //when:
     int result = calculator.multiply(4, 3);

     //assert:
     assertEquals(12, result);
     }

     @Test 
     public void testThatCalculatorThatCanDivideTwoPositiveNumbers() {
     //given:
     CalculatorApp calculator = new CalculatorApp();
     
     //when: 
     int result = calculator.divide(12, 3);

     //assert:
     assertEquals(4, result);
     }
}