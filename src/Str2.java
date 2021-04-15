public class Str2 {
    public static void main(String[] args) {
        String a = "Вован Иванов";
        String b = "иван иванов";
        checkUserName(a, b);
    }

    private static void checkUserName(String a, String b) {
        String bcopy = b.replace(" ", "");
        if(a.equalsIgnoreCase(b)) {
            System.out.println("Выберете другое имя.");
            System.out.println("Ваше имя имеет длину - " + b.length());
            System.out.println("А без пробелов ваше имя занимает " + b.trim().length() + " символов.");
        } else {
            System.out.print("Отличное имя!");
            System.out.println("Ваше имя имеет длину - " + b.length());
            System.out.println("А без пробелов ваше имя занимает " + bcopy.length() + " символов.");
        }
    }
}

