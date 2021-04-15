package zadachi;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] arr = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(arr[2]);


    }
}
