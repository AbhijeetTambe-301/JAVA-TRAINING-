public class EvenOddPattern {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " -> odd");
            } else {
                System.out.println(i + " -> even");
            }
        }
    }
}