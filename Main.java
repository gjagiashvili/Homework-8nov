import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Homework 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი, რომლის წინა ნატურალური რიცხვების საშუალო არითმეტიკული დაითვლება: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double mean = (double) sum / n;
        System.out.println(n + "-მდე რიცხვების საშუალო არითმეტიკული: " + mean);

        // Homework 2
        System.out.print("შეიყვანეთ რიცხვი, რომლის ჯამები დაითვლება: ");
        int num = scanner.nextInt();

        System.out.print("რიცხვის ხარისხების ჯამი: ");
        while (num > 0) {
            int power = Integer.highestOneBit(num);
            System.out.println(power + " ");
            num -= power;
        }

        // Homework 3
        System.out.print("კენტი რიცხვები 5, 7, და 11 გარეშე: ");
        for (int i = 1; i <= 15; i += 2) {
            if (i == 5 || i == 7 || i == 11) continue;
            System.out.print(i + ", ");
        }
        System.out.println();

        // Homework 4

        System.out.print("შეიყვანეთ რიცხვი ორობით სისტემაში: ");
        int binary= scanner.nextInt();
        int decimal = 0;
        int multiplier = 1;

        while (binary > 0) {

            int last = binary % 10;
            decimal += multiplier * last;

            binary /= 10;
            multiplier *= 2;
        }

        System.out.println("რიცხვი ათობით სისტემაში: " + decimal);

        // Homework 5

        System.out.print("შეიყვანეთ ათობით სისტემაში რიცხვი: ");
        decimal = scanner.nextInt();
        String binaryNumber = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryNumber = remainder + binaryNumber;
            decimal /= 2;
        }

        System.out.println("ორობითი რიცვი: " + binaryNumber);

        // Homework 6

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guessedNumber = 0;

        System.out.println("თამაში გამოიცანი რიცხვი 1-დან 100-მდე");

        while (guessedNumber != randomNumber) {
            System.out.print("შეიყვანეთ რიცხვი: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber == randomNumber) {
                System.out.println("ყოჩაღ! შენ გამოიცანი სწორი რიცხვი");
                break;
            } else if (guessedNumber < randomNumber) {
                System.out.println("შეყვანილი რიცხვი ნაკლებია ჩაფიქრებულ რიცხვზე.");
            } else {
                System.out.println("შეყვანილი რიცხვი მეტია ჩაფიქრებულ რიცხვზე.");
            }
        }
    }
}
