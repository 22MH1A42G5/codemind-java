import java.util.Scanner;
public class Fibanacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int t=0;
        while(a<=n){
            if(a==n){
                System.out.println("True");
                return;
            }
            a=b;
            t++;
            b=c;
            c=a+b;
            //if(t!=1)
            //System.out.print(a+" ");
        }
        System.out.println("False");
    }
}