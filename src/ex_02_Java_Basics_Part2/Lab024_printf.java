package ex_02_Java_Basics_Part2;

public class Lab024_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your variable is %d", a);
        System.out.println();
        // %d -> int, byte, long, short
        // %s -. string
        // %f -> float,double
        // %b -> boolean

        int b = 20;
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("your value is %d and %d", a, b);
    }
}
