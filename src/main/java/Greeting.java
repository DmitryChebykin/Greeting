import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        System.out.printf("Привет, %s!", scanner.nextLine());
    }
}