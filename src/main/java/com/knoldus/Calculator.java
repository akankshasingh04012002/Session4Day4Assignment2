package com.knoldus;

public class Calculator {
    public int add(int firstElement, int secondElement) {
        return firstElement + secondElement;
    }

    public int subtract(int firstElement, int secondElement) {
        return firstElement - secondElement;
    }

    public int multiply(int firstElement, int secondElement) {
        return firstElement * secondElement;
    }

    public int divide(int firstElement, int secondElement) {
        if (secondElement == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstElement / secondElement;
    }
}
