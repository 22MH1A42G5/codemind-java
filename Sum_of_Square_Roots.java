import java.util.Scanner;
public class nsc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double s=0;
        for(double i=a;i<=b;i++){
            s=s+Math.sqrt(i);
        }
        System.out.printf("%.2f",s);
    }
}