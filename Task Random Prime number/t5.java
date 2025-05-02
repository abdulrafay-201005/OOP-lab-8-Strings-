import java.util.*;

public class t5 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int generateRandomPrime(int min, int max) {
        List<Integer> primes = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        if (primes.size() > 0) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(primes.size());
            return primes.get(randomIndex);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int prime = generateRandomPrime(min, max);
        if (prime != -1)
            System.out.println("Random prime between " + min + " and " + max + ": " + prime);
        else
            System.out.println("No prime numbers found in the given range.");
    }
}
