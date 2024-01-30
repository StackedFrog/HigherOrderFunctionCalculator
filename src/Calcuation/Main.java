package Calcuation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, BinaryOperator<Double>> operators = new HashMap<>();  // create a collection with key and value
        operators.put("+", Operations::addition);                                      // add operators (key) collection with method reference as the value
        operators.put("-", Operations::subtraction);
        operators.put("*", Operations::multiplication);
        operators.put("/", Operations::division);
        operators.put("^", Operations::power);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me some maths");
        System.out.print("Ex. 3 * 4, 7 + 5, 3 / 10: ");
        String mathsEntered = scanner.nextLine();
        String[] splitMathsEntered = (mathsEntered.split(" "));  // split into numerical values and operators at whitespace

        double numberOne = Double.parseDouble(splitMathsEntered[0]);
        String operator1 = splitMathsEntered[1];
        double numberTwo = Double.parseDouble(splitMathsEntered[2]);
        String operator2 = splitMathsEntered[3];
        double numberThree = Double.parseDouble(splitMathsEntered[4]);

    }
}
