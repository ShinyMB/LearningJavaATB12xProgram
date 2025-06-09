package ex_03_Literals;

public class Lab031_Boolean_Literals {
    public static void main(String[] args) {
        boolean Are_you_married = false;
        boolean India = true;

        // boolean are_you_student = 12345 - ERROR
        // boolean will not take numeric values.

        System.out.printf("Are you married= %b", Are_you_married).println();
        System.out.printf("Are you Indian= %b", India);

    }
}
