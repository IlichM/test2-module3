import java.util.Scanner;

public class NumberPhone {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         boolean isCorrectNumber = false;
         while(!isCorrectNumber) {
             String phoneNumber = scan.nextLine();
             if(isCorrectNumber) {
                 System.out.println("Введите корректный номер!");
             } else {
                 System.out.println(formatNumber(phoneNumber));
             }
         }
    }
    private static boolean checkPhoneNumberIsCorrect(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]","");
        return clean.length() == 11;
    }
    private static String formatNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+ 7" + " " + clean.substring(1,4) + " " + clean.substring(4,7) +
                " " + clean.substring(7,9) + "" + clean.substring(9);
        return result;
    }
}
