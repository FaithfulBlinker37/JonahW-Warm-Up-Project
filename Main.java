public class Main {
    public static void main(String[] args) {
        System.out.println(totalSum(2000000));

    }

    public static long totalSum(int limit) {
        boolean[] primeNumber = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            primeNumber[i] = true;

        }

        for (int i = 2; i * i < limit; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j < limit; j += i) {
                    primeNumber[j] = false;
                }
            }
        }
        long sum = 0;
        for (int i = 2; i < limit; i++) {
            if (primeNumber[i]) {
                sum += i;
            }
        }
        return sum;
    }
}