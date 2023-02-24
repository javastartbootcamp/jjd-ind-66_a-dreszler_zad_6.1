package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Podaj liczbę");
            number = input.nextInt();
            if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Podana liczba jest ok :)");
                break;
            }
        }
    }
}
