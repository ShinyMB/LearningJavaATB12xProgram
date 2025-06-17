package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(++a);
//        System.out.println(a);

// POST Increment = assign/print first then increase the value
//
//        int a_post = 10;
//        int b = a_post++;
//        System.out.println(a_post);
//        System.out.println(b);

        // ERT
        // Line No.   |     a_post     |     b
        //      11    |      10        |     NA
        //      12    |      11        |     10
        //      13    |      11        |     NA
        //      14    |      NA        |     10


        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        // 24  -  10  -  NA
        // 25  -  10  -  na
        // 26  -  11  -  Na

    }
}
