import java.util.Scanner;
public class Circular{
    static int prime(int n){
        for(int i=2;i<=(n+1)/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,r,rev=0;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if(prime(n)==1 && prime(rev)==1){
            System.out.println("circular prime");
        }
        else if(prime(n)==1){
            System.out.println("prime but not a circular prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}