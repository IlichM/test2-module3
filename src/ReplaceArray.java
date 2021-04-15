public class ReplaceArray {
    public static void main(String[] args) {
        String[] a = { "Каждый ", "человек ", "хочет ", "получать ", " деньги ", "ничего ", "не ", "делая " };
        //выводим начальный массив в консоль
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        // переменная, которая будет использоваться при замене элементов
        String temporary;

        for(int i = 0; i < n/2; i++) {
            temporary = a[n-i-1];
        // n-i-1 формула для определения противоположенного элемента массива
            a[n-i-1] = a[i];
            a[i] = temporary;
        }
        //выводим измененный массив в консоль
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
