import java.util.Scanner;

public class codemind2 {
    static int prime(int n) {
        if (n == 1 || n == 0)
            return 0;
        for (int i = 2; i < (n + 2) / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                //System.out.println(i);
                if(prime(i)==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}