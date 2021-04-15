package zadachi;

public class Three {
    public static void main(String[] args) {
        int i,j;
        String[] result = new String[5];
        int[][] points = {
                {3,6,7,9,3},
                {3,9,0,6,1},
                {7,6,4,9,0},
                {1,3,8,0,4},
                {5,9,2,5,7},
        };
        String[] names = {"Павел","Сидор","Евпатий","Коловратий","Аюшкин"};
        int[] sumPoints = new int[5];
        for(i = 0; i < names.length; i++) {
            for(j = 0; j < names.length; j++) {
                sumPoints[i] += points[i][j];
            }
            result[i] = names[i] + " " + sumPoints[i];
            System.out.println(result[i]);
        }

    }
}
