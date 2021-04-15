package one;

public class Cookie {
    public static void main(String[] args) {
        Knight knight = new Knight();
        byte b1 = 120;
        byte b2 = 8;
        byte b3 = (byte) (b1+b2);
        System.out.println(b3);
    }
    protected void print() {
        System.out.println("Print something");
    }
}
