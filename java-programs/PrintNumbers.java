import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numebrs fo you want me to print?");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }

        scanner.close();

    }
}
