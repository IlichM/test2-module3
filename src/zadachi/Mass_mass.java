package zadachi;

public class Mass_mass {
    public static void main(String[] args) {
        int[][] array = {
                {1,4,6,7},
                {5,2,8,9},
                {4,9,7,6}
        };
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}