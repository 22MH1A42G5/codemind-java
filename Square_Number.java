import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=0;i<=n;i++){
            for(long j=0;j<=n;j++){
                if(i*i+j*j==n){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
}