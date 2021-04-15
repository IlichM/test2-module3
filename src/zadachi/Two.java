package zadachi;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя - ");
        String name = scan.nextLine();
        System.out.println("Введите пароль - ");
        String pw = scan.nextLine();
        if (pw.length() < 8 || pw.length() > 15) {
            do {
                System.out.println("Длина пароля должна быть от 8 до 15 символов");
                pw = scan.nextLine();
            } while (pw.length() < 8 || pw.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, pw);
    }
}
