package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero: ");
        boolean intChecker = input.hasNextInt();
        if(intChecker) {
            int number = input.nextInt();
            numberToWords(number);
            input.close();
        } else {
            System.out.println("Por favor solo ingresar numeros.");
        }
    }

    public static void numberToWords(int a) {
        if(a < 0) {
            System.out.println("Ingresar solo valores mayores a cero");
        } else if(a == 0) {
            System.out.println("Zero");
        } else {
            int counter = 0;
            int length = getDigitCount(a);
            a = reverse(a);
            if (a >= 1) {
                do {
                    int lastNumber = a % 10;
                    a /= 10;
                    switch (lastNumber) {
                        case (1):
                            System.out.println("One");
                            counter++;
                            break;
                        case (2):
                            System.out.println("Two");
                            counter++;
                            break;
                        case (3):
                            System.out.println("Three");
                            counter++;
                            break;
                        case (4):
                            System.out.println("Four");
                            counter++;
                            break;
                        case (5):
                            System.out.println("Five");
                            counter++;
                            break;
                        case (6):
                            System.out.println("Six");
                            counter++;
                            break;
                        case (7):
                            System.out.println("Seven");
                            counter++;
                            break;
                        case (8):
                            System.out.println("Eight");
                            counter++;
                            break;
                        case (9):
                            System.out.println("Nine");
                            counter++;
                            break;
                        case (0):
                            System.out.println("Zero");
                            counter++;
                            break;
                        default:
                            System.out.println("Hmmm");
                    }
                } while (a > 0);
                while (counter < length) {
                    System.out.println("Zero");
                    counter++;
                }
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        number = number < 0 ? number * (-1) : number;
        int newNumber = 0, counter = 1;
        do {
            int lastNumber = number - ((number / 10) * 10);
            number /= 10;
            newNumber = (newNumber * counter)+ lastNumber;
            counter = 10;
        } while(number > 0);
        if(isNegative) {
            return (newNumber * -1);
        } else {
            return newNumber;
        }
    }

    public static int getDigitCount(int a) {
        if(a < 0) {
            return -1;
        } else {
            int counter = 0;
            do {
                a /= 10;
                counter++;
            } while (a > 0);
            return counter;
        }
    }
}
