import java.util.Scanner;
public class pda{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0){
                s=s+i;
            }
        }
        if(s==n){
            System.out.println("PERFECT");
        }
        else if(s<n){
            System.out.println("DEFICIENT");
        }
        else if(s>n){
            System.out.println("ABUNDANT");
        }
    }
}