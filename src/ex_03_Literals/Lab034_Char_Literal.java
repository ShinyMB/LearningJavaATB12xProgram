package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        // Character Literals are always written within single quotes

        char C = 'A';
        char C1 = '3';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char, Java also provides special char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        // Example

        System.out.println("ShinyPriyanka");

        System.out.println("Shiny"+new_line+"Priyanka");
        System.out.println("Shiny\nPriyanka");
        // both statements give the same result.

        System.out.println("Shiny"+tab_line+"Priyanka");
        System.out.println("Shiny\tPriyanka");

        System.out.println("Shiny"+back_space+"Priyanka");
        System.out.println("Shiny\bPriyanka");

        System.out.println("-----------------");

        System.out.println("Shiny is\nPriyanka");
        System.out.println("Shiny\nPriyanka");

        // Char are a part of integers.
        // Each char(alphabet, number, symbol, emoji)
        // has a assigned ASCII value (alpha-numeric also called Uni-code)


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';



    }
}
