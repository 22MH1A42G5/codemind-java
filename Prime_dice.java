import java.util.*;
public class PrimeDice{
    static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(prime(a+b))
            System.out.println("tevitt");
            else
            System.out.println("Satya");
            t--;
        }
    }
}