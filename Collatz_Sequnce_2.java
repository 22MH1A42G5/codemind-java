import java.util.Scanner;
public class Collatz{
    static int collatzLength(int n){
        int l=0;
        while(n!=1){
            if (n%2==0){
                n=n/2;
            }
            else{
                n=((3*n)+1);
            }
            l++;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0,temp=0,ans=0;
        for(int i=a;i<=b;i++){
            temp=collatzLength(i);
            if(temp>max){
                max=temp;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}