package Calcuation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, BinaryOperator<Double>> operators = new HashMap<>();   // create a collection for operators with method reference as the value
        ArrayList<BinaryOperator<Double>> methods = new ArrayList<>();           // to store operators as methods
        ArrayList<Double> numbers = new ArrayList<>();                              // to store the numbers
        ArrayList<String> operations = new ArrayList<>();                            // to store operators as strings

        operators.put("+", Operations::addition);                                        // add operators (key) collection with method reference as the value
        operators.put("-", Operations::subtraction);
        operators.put("*", Operations::multiplication);
        operators.put("/", Operations::division);
        operators.put("^", Operations::power);
        operators.put("v", Operations::root);

        Scanner scanner = new Scanner(System.in);                                   // get user input
        System.out.println("Please give me some maths");
        System.out.print("Ex. 3 * 4, 7 + 5, 3 / 10 - 2: ");
        String mathsEntered = scanner.nextLine();
        String[] splitMathsEntered = (mathsEntered.split(" "));            // split into numerical values and operators at whitespace

        numbers.add(Double.parseDouble(splitMathsEntered[0]));
        methods.add(operators.get(splitMathsEntered[1]));                          // method reference stored in ArrayList, returns operation
        operations.add(splitMathsEntered[1]);
        numbers.add(Double.parseDouble(splitMathsEntered[2]));

        if (splitMathsEntered.length > 3 && splitMathsEntered.length <= 5) {
            methods.add(operators.get(splitMathsEntered[3]));
            operations.add(splitMathsEntered[3]);
            numbers.add(Double.parseDouble(splitMathsEntered[4]));
        }
        else if (splitMathsEntered.length > 5) {                                                                            // warn about the dangers of math-ing too hard
            System.out.println("TOO MUCH MATHS!!!!!!");
            return;
        }
        System.out.printf("Result: %.2f", Calculate.calculate(numbers, methods, operations));
    }
}
