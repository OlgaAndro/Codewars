import java.util.Scanner;

public class Returning_Strings_my_variant {
    /*
    Make a function that will return a greeting statement that uses an input;
    your program should return, "Hello, <name> how are you doing today?".

[Make sure you type the exact thing I wrote or the program may not execute properly]
     */

    public static String greet(String name)
    {
        // Your code here
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        return "Hello," + name + " how are you doing today?";
    }

    public static void main(String[] args) {
        System.out.println("Type your name:");
        System.out.println(greet(""));
    }


}
