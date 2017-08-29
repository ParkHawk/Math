package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.print("Input second number: ");
        double operand1 = Double.parseDouble(userInput);
        String userInput2 = scanner.nextLine();
        double operand2 = Double.parseDouble(userInput2);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double division = operand1 / operand2;

        double multiplication = operand1 * operand2;

        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);

    }


    public static void showResults(double sum, double difference, double division, double multiplication, double remainder){

    System.out.println("The sum of the two inputs is " + sum);
    System.out.println("The difference of the two inputs is " + difference);
    System.out.println("The division of the two numbers is " + division);
    System.out.println("The result of multiplying the two inputs is " + multiplication);
    System.out.println("The remainder after dividing the two inputs is " + remainder);

    }
}
