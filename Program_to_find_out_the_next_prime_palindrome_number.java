import java.util.Scanner;
public class palind{
    static boolean palindrome(int n){
        int t=n,rem,rev=0;
        while(t!=0){
            rem=t%10;
            rev=rev*10+rem;
            t/=10;
        }
        if(n==rev){
            return true;
        }
        else 
        return false;
    }
    static boolean prime(int n){
        for(int i=2;i<=(n/2)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n+1;
        while(true){
            if(palindrome(i) && prime(i)){
                System.out.println(i);
                break;
            }
            i+=1;
        }
    }
}