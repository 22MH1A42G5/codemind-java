import java.util.Scanner;

public class codemind2 {
    static int prime(int n) {
        if (n == 1 || n == 0)
            return 0;
        for (int i = 2; i < (n + 1) / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(prime(n)==1){
                System.out.println(0);
                return;
            }
            int forw = 0, back = 0, f = 0, b = 0;
            for (int i = n - 1; i < n; i--) {
                b++;
                if (prime(i) == 1) {
                    back = i;
                    break;
                }
            }
            for (int i = n + 1; i > n; i++) {
                f++;
                if (prime(i) == 1) {
                    forw = i;
                    break;
                }
            }
            int forw1=forw-n;
            int back1=n-back;
            int min=back1>forw1?forw1:back1;
            System.out.println(min);

    }
}