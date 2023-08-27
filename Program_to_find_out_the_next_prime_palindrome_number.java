import java.util.Scanner;
public class nextpal{
    static boolean prime(int n) {
        for (int i = 2; i <=(n/2)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean palind(int n){
        int t=n,rem,rev=0;
        while(t!=0){
            rem=t%10;
            rev=rev*10+rem;
            t/=10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n+1;
        while(true){
            if(prime(i)&& palind(i)){
                System.out.println(i);
                break;
            }
            i+=1;
        }
    }
}