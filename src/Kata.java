/*
Implement a function called multiply, which takes two numbers and returns their product:
multiply(2, 3) = 6
multiply(0, 188) = 0
multiply(85, 144) = 12240
 */
//https://www.codewars.com/kata/523b66342d0c301ae400003b/train/java

public class Kata {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int product = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
