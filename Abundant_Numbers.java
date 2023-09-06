import java.util.Scanner;
public class Abundant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,i;
        for(i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        if(s>n){
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}