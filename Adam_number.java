import java.util.Scanner;
public class Adam{
    static int Reverse(int n){
        int rem,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqn=n*n;
        int rn=Reverse(n);
        int sqrn=rn*rn;
        int rsqrn=Reverse(sqrn);
        if(rsqrn==sqn){
            System.out.println("True");
        }
        else
        System.out.println("False");
        
    }
}