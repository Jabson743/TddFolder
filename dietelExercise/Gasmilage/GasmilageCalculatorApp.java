public class GasmilageCalculatorApp {

     public double computeMilesPerGallon(double numberOfMilesDriven, double numberOfGallon) {
    
     return 1.5;

     }

     public int multiply(int firstNumber, int secondNumber) {

     int holder = 
     int product = 0;

     if(secondNumber < 0) {

       holder = secondNumber;
       secondNumber = firstNumber;
       firstNumber = holder;

     }

     for (int counter = 1; counter <= secondNumber; counter++) {
         product = product + firstNumber;

       }
         return product;
     }

}