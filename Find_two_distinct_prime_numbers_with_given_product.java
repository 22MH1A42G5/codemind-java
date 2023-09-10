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
        int i,j,k;
        for(i=1;i<n;i++){
        for(j=1;j<n;j++){
            if(prime(i)==1 && prime(j)==1){
                if(i!=j){
                    if(i*j==n){
                        System.out.print(i+" "+j);
                        return;
                    }
                }
            }
        }    
        }
        System.out.println(-1);
    }
}