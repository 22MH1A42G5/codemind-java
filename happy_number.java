import java.util.Scanner;

public class codemind2 {
    static int digits(int n) {
        int r, c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, r, s = 0;
        while (digits(n) != 1) {
            temp = n;
            s = 0;
            //System.out.println(n);
            while (temp != 0) {
                r = temp % 10;
                s = s + r * r;
                n = s;
                temp /= 10;
            }
        }
        //System.out.println(n);
        if (n == 1 || n == 7) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}