import java.util.Scanner;
public class palin{
    static int prime(int n) {
        if (n == 1 || n == 0)
            return 0;
        for (int i = 2; i < (n + 1) / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
    static int palin(int n){
        int temp=n,rem,rev=0;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        int ans=(rev==n)?1:0;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n+1;
        while(true){
            if(prime(i)==1 && palin(i)==1){
                System.out.println(i);
                return;
            }
            i++;
        }
    }
}