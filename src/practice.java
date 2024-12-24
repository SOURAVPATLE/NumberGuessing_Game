public class practice {
    public static boolean isPime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PubPrime(int n){
        for (int i=2;i<=n;i++){
            if (isPime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
            PubPrime(10);
    }
}
