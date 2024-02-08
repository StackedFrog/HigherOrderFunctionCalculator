package Calcuation;

public class Operations {                                      // define all the operator's methods
    static Double addition(double a, double b){
        return a + b;
    }
    static double subtraction(double a, double b){
        return a - b;
    }
    static double multiplication(double a, double b){
        return a * b;
    }
    static double division(double a, double b){
        return a / b;
    }
    static double power(double a, double b){
        return Math.pow(a, b);
    }
    static double root(double a, double b){
        return Math.pow(b, 1 / a);
    }
}
