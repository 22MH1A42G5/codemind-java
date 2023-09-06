import java.util.Scanner;
public class ClosestPalin{
    static int palin(int n){
        int rem,rev=0;
        int temp=n;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        //System.out.println(rev);
        if(n==rev)
        return 1;
        else 
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n);
        int h=palin(n);
        int temp=n,forw=0,back=0,f=0,b=0;
        for(int i=n-1;i<n;i--){
            b++;
            if(palin(i)==1){
                back=i;
                break;
            }
        }
        for(int i=n+1;i>n;i++){
            f++;
            if(palin(i)==1){
                forw=i;
                break;
            }
        }
        int ans=b>f?forw:back;
        if(f==b){
            System.out.print(back+" "+forw);
        }
        else{
            System.out.println(ans);
        }
    }
}