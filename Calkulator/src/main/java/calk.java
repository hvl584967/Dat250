package main.java;

import javax.swing.*;

public class calk {

    public static void main(String[] args){
        String num1 = JOptionPane.showInputDialog("type first number");
        String op = JOptionPane.showInputDialog("specify operation");
        String num2 = JOptionPane.showInputDialog("type second number");
        System.out.println(operation(num1,op,num2));
    }

    private static Double operation(String n1, String op, String n2){
        Double sum = 0.0;
        Double num1 = 0.0;
        Double num2 = 0.0;
        try {
            num1 = Double.parseDouble(n1);
            num2 = Double.parseDouble(n2);
            System.out.println("parsed");
        } catch(NumberFormatException e) {
            return 0.0;
        }

        if(op.equals("*")){
            sum = mult(num1,num2);
        }
        else if(op.equals("+")){
            sum = add(num1,num2);
        }
        else if(op.equals("-")){
            sum = sub(num1,num2);
        }
        else if(op.equals("/")){
            sum = div(num1,num2);
        }
        return sum;
    }

    private static Double mult(Double n1, Double n2){
        return n1*n2;
    }
    private static Double add(Double n1, Double n2){
        return n1+n2;
    }
    private static Double sub(Double n1, Double n2){
        return n1-n2;
    }
    private static Double div(Double n1, Double n2){
        return n1/n2;
    }
}
