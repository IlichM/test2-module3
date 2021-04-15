package zadachi;
import java.util.Scanner;

public class Ten {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(string);
        while(string.length() > 2) {
            string = string.substring(1, string.length()-1);

            System.out.println(string);

        }
    }
}

