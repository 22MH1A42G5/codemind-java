import java.util.Scanner;

public class codemind2 {
    static int prime(int n) {
        if (n == 1 || n == 0)
            return 0;
        for (int i = 2; i <= (n + 1) / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a+1; i < b; i++) {
            if (prime(i) == 1) {
                System.out.println(i);
            }
        }

    }
}