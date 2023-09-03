public class countingSheep {

    public static String countingSheep(int num) {
        //1 sheep...2 sheep...3 sheep
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num ; i++) {
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(countingSheep(5));

    }
}

