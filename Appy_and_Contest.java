import java.util.Scanner;
public class Contest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            long c=0;
            long n=sc.nextLong();
            long f=sc.nextLong();
            long v=sc.nextLong();
            long k=sc.nextLong();
            long ans;
            if(f%v==0)
            ans=n/v-n/f;
            else if(v%f==0)
            ans=n/f-n/v;
            else
            ans=n/f+n/v-(n/(f*v));
            if(ans>=k)
            System.out.println("Win");
            else
            System.out.println("Lose");
            t--;
        }
    }
}