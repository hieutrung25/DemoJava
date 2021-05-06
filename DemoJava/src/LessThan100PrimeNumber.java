import java.util.Scanner;

public class LessThan100PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert limit");
        int limit = sc.nextInt();
        int number = 2;
        while (number <= limit) {
            if (isPrime(number)) {
                System.out.print(number+" ");
            }
            number++;
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
