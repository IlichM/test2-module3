public class Str3 {
    public static void main(String[] args) {
        String a = "22";
        String b = "22";

        Str3 main = new Str3();
        Str3 main1 = main;
        System.out.println(main.hashCode());
        System.out.println(main1.hashCode());

    }
}
