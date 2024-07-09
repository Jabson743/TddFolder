import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GasmilageCalculatorTest {

    @Test
    public void testThatCanCalculateMilesPerGallon() {
       
    //given
    GasmilageCalculatorApp calculator = new GasmilageCalculatorApp();

    //when
    double numberOfMilesDriven = 30.00;
    double numberOfGallon = 20;
    double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallon);

    //assert
    assertEquals (1.5, milesPerGallon);
    
    }

    @Test
    public void testThatCalculatorThatCanMultiplyTwoPositiveNumbers() {
    //given
    GasmilageCalculatorApp calculator = new GasmilageCalculatorApp();

    //when
    int result = calculator.multiply(-3, 4);

    //assert
    assertEquals(12, result);

   }
}