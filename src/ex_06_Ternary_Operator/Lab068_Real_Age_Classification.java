package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
/*
        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
        System.out.println(age);

        String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    */



        String User_Input = args[0];
        int A = Integer.parseInt(User_Input);
        System.out.println(A);
        String Result = (A < 18) ? "Minor" : (A < 65) ? "Adult" : "Senior";
        System.out.println(Result);




    }
}
