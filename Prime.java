import java.util.Scanner;
public class nsc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        for(int i=2;i<=(n+1)/2;i++){
            if(n%i==0){
                s=0;
                break;
            }
        }
        if(s==1){
            System.out.println("Prime");
        }
        else
        System.out.println("Not Prime");
    }
}