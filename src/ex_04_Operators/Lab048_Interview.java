package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int salary = 12;
        boolean b = !(salary > 10 || salary < 5);
        System.out.println(b);

        // A - salary > 10 -> 12 > 10 -> true
        // B - salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false

    }
}
