package Ex2Numbers;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(" a больше b");
        }
        else if (a < b) {
            System.out.println("b больше a");
        }
        else {
            System.out.println("a и b равны");
        }
    }
}

