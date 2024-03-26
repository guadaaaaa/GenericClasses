package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        Arithmetic ar = new Arithmetic(num1, num2);

        System.out.println("Sum: "+ ar.add());
        System.out.println("Difference: "+ ar.subtract());
        System.out.println("Product: "+ ar.multiply());
        System.out.println("Quotient: "+ ar.divide());
        System.out.println("Minimum: "+ ar.getMin());
        System.out.println("Maximum: "+ ar.getMax());
    }
}