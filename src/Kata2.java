public class Kata2 {
    public static int makeNegative(final int x) {
        if (x < 0) {
            return x; // Если число уже отрицательное, возвращаем его без изменений
        } else {
            return -x; // Если число положительное, возвращаем его с противоположным знаком
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = makeNegative(num);
        System.out.println("The negative value of " + num + " is: " + result);
    }
}
