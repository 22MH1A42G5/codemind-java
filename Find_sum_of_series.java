import java.util.Scanner;
public class series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double s=0;
        for(double i=1;i<=n;i++){
            s+=(1/i);
        }
        System.out.printf("%.2f",s);
    }
}