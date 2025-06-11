package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_num = 9988776655l;
        // short num = phone_num; // Narrowing - implicit -> shows error
        short num = (short)phone_num; // // Narrowing - Explicit
        System.out.println(num);
    }
}
