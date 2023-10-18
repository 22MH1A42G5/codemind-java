import java.util.*;
public class Palindromes{
    static boolean palind(int n){
        int temp=n,rev=0,r;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev==n?true:false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(palind(sc.nextInt()))
            cnt++;
        }
        System.out.println(cnt);
    }
}