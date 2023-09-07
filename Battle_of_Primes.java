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
        int b=sc.nextInt();
        int n=a+b;
        int f = 0;
        for (int i = n + 1; i > n; i++) {
            f++;
            if (prime(i) == 1) {
                break;
            }
        }
        System.out.println(f);
    }
}