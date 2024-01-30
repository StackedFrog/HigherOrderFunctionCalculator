package Calcuation;

import java.util.function.BinaryOperator;

public class Calculate {
    public static double calculate(double arg1, double arg2, BinaryOperator<Double> operation){
        return operation.apply(arg1, arg2);
    }
}
