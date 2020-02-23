package com.company;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        do {
            System.out.println("Por favor ingrese el numero: ");
            boolean intChecker = input.hasNextLong();
            if (intChecker) {
                long number = input.nextLong();
                numberToWords(number);
                input.nextLine();
                System.out.println("Desea volver a ingresar un numero? Y/N");
                String oneMoreTime = input.nextLine().toLowerCase();
                if(oneMoreTime.equals("y")) {
                    continue;
                } else if(oneMoreTime.equals("n")) {
                    System.out.println("Gracias por jugar.");
                    break;
                } else {
                    System.out.println("Opcion invalida. Cerrando Apliacion");
                    break;
                }
            } else {
                System.out.println("Por favor solo ingresar numeros.");
            }
            input.nextLine();
        } while(true);
    }

    public static void numberToWords(long a) {
        if(a < 0) {
            System.out.println("Ingresar solo valores mayores a cero");
        } else if(a == 0) {
            System.out.println("Zero");
        } else {
            int counter = 0;
            long length = getDigitCount(a);
            a = reverse(a);
            if (a >= 1) {
                do {
                    long lastNumber = a % 10;
                    a /= 10;
                    switch ((int)lastNumber) {
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

    public static long reverse(long number) {
        boolean isNegative = number < 0;
        number = number < 0 ? number * (-1) : number;
        long newNumber = 0, counter = 1;
        do {
            long lastNumber = number - ((number / 10) * 10);
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

    public static long getDigitCount(long a) {
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
