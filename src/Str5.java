public class Str5 {
        public static void main(String[] args) {
            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        }

         private static String removeWhiteSpaces(String str) {
            return str.replaceAll(" ", "");

        }

}
