package calculator;
//Create a Calculator class. This should have functions for Add, Subtract,
// Multiply and Divide, each taking in two doubles to perform the calculations on.
public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("addition "+calculator.add(22,44));
        System.out.println("Substraction "+calculator.substract(22,44));
        System.out.println("Multipy "+calculator.multiply(22,44));
        System.out.println("Divide "+calculator.divide(44,22));
    }
}
