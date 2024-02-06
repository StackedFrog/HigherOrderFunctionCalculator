package Calcuation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculate {
    public static double calculate(ArrayList<Double> numbers, ArrayList<BinaryOperator<Double>> methods, ArrayList<String> operators) {
        if (methods.size() < 2) {
            return methods.getFirst().apply(numbers.getFirst(), numbers.get(2));
        }
        double temp;
        if ((operators.getLast().equals("*") || operators.getLast().equals("/")) && (operators.getFirst().equals("+") || operators.getFirst().equals("-"))){
            temp = methods.getLast().apply(numbers.get(1), numbers.get(2));
            return methods.getFirst().apply(numbers.get(0), temp);
        }
        else if ((operators.getLast().equals("v") || operators.getLast().equals("^")) && !(operators.getFirst().equals("v") || operators.getFirst().equals("^"))){
            temp = methods.getLast().apply(numbers.get(1), numbers.get(2));
            return methods.getFirst().apply(numbers.get(0), temp);
        }
        temp = methods.getFirst().apply(numbers.get(0), numbers.get(1));
        return methods.getLast().apply(temp, numbers.get(2));
    }
}
