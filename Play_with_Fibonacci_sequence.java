import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        while(n!=1){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
            n--;
        }
    }
}