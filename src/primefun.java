public class primefun {
    public static boolean isPrime(int n) {

        boolean isPrime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { //completly deviding
                isPrime = false;

            }
        }

        return isPrime;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(12  ));
    }
}