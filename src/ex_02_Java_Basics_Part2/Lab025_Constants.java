package ex_02_Java_Basics_Part2;

public class Lab025_Constants {
    public static void main(String[] args) {
        // int a;
        // System.out.println(a);

        // JVM will never assign default value for a local variable.

        int a = 10;
        System.out.println(a);

        // CONSTANTS also called final variables
        // can be assigned by using the keyword, final

        final int b = 15;

        // b = 20, JVM will not be able to change the value of b because it is a constant.
        System.out.println(b);

        final float Pi = 3.14f;
        final long Ph = 9988776655L;

        System.out.println(Pi);
        System.out.println(Ph);
        System.out.printf("Pi = %f",Pi).println();
        System.out.printf("Ph = %d",Ph);

    }


}
