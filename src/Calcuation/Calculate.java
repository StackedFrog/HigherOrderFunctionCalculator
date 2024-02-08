package Calcuation;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Calculate {
    public static double calculate(ArrayList<Double> numbers, ArrayList<BinaryOperator<Double>> methods, ArrayList<String> operators) {
        if (methods.size() < 2) {
            return methods.getFirst().apply(numbers.getFirst(), numbers.get(1));
        }
        double result;
        double temp;        // create a temporary variable to hold the first result before the second calculation is preformed
        if ((operators.getLast().equals("*") || operators.getLast().equals("/")) &&
                (operators.getFirst().equals("+") || operators.getFirst().equals("-"))){
            temp = methods.getLast().apply(numbers.get(1), numbers.get(2));
            result = methods.getFirst().apply(numbers.get(0), temp);
            return result;
        }
        else if ((operators.getLast().equals("v") || operators.getLast().equals("^")) &&
                !(operators.getFirst().equals("v") || operators.getFirst().equals("^"))){
            temp = methods.getLast().apply(numbers.get(1), numbers.get(2));
            result = methods.getFirst().apply(numbers.get(0), temp);
            return result;
        }
        temp = methods.getFirst().apply(numbers.get(0), numbers.get(1));
        result = methods.getLast().apply(temp, numbers.get(2));
        return result;
    }
}
