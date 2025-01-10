public class TotalSum {
    public static void main(String[] args) {
        System.out.println(totalSum(2000000));

    }

    public static double totalSum(int limit) {
        boolean[] isPrime = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }