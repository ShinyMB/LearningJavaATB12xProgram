package Tasks;

public class Practise_Task_In_De {
    public static void main(String[] args) {
        int l = 11;
        l = l++ + ++l;
        System.out.println(l);
        // 11 + 13 = 24




        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        //  c =  a  +  b  +  a++  +  b++  +  ++a  +  ++b
        //  c =  11 + 22  +  11   +  22   +  13   +  24

        /*
        a = 13
        b = 24
        c = 103
         */

        //Current value         i = 0  j = 1  k = 2
                            int i = 1, j = 2, k = 3;
                            int m = i-- - j-- - k--;
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
        // m = 1 - 2 - 3 = 14
        // i=0, j=1, k=2, m=-4


    }
}
