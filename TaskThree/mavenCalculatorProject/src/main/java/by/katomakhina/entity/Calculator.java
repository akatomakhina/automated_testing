package by.katomakhina.entity;

import by.katomakhina.parse.Parser;

public class Calculator {
    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
    }


    public Double calculate() {
        String[] arr = Parser.parse(expression);
        if (arr == null) {
            return null;
        }
        double a1 = Double.parseDouble(arr[0]);
        double a2 = Double.parseDouble(arr[1]);
        /*switch (Parser.getSignFromString(expression)) {
            case "+":
                return a1 + a2;
            case "-":
                return a1 - a2;
            case "*":
                return a1 * a2;
            case "/": {
                if (a2 != 0) {
                    return a1 / a2;
                } else
                    return null;
            }
            default:
                return null;
        }*/
        String s = Parser.getSignFromString(expression);
        if (s.equals("+")) {
            return a1 + a2;
        } else if (s.equals("-")) {
            return a1 - a2;
        } else if (s.equals("*")) {
            return a1 * a2;
        } else if (s.equals("/")) {
            if (a2 != 0) {
                return a1 / a2;
            } else
                return null;
        } else {
            return null;
        }
    }

}
