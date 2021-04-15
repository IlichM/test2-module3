import java.util.Scanner;

public class CorrectName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] fio = name.trim().split(" ");
        return fio.length == 3;
    }
    private static String formatName(String name) {
        String[] fio = name.trim().split(" ");
        sortByLength(fio);
        String result = "";
        for (int i = 0; i < fio.length; i++) {
            String str = fio[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] fio) {
        for (int i = 0; i < fio.length - 1; i++) {
            for (int j = 0; j < fio.length - 1; j++) {
                if (fio[j].length() > fio[j + 1].length()) {
                    String tmp = fio[j];
                    fio[j] = fio[j + 1];
                    fio[j + 1] = tmp;
                }
            }
        }
    }
}


