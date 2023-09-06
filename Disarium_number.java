import java.util.Scanner;
public class Disarium{
    static int pow(int n,int i){
        int p=1;
        while(i!=0){
            p=n*p;
            i--;
        }
        return p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rem,s=0,temp1=n,dig=0;
        while(temp1!=0){
            dig++;
            //System.out.println(dig);
            temp1=temp1/10;
        }
        //System.out.println(dig);
        while(temp!=0){
            rem=temp%10;
            s=pow(rem,dig)+s;
            dig--;
            temp/=10;
        }
        if(s==n)
        System.out.println("True");
        else
        System.out.println("False");
        //System.out.println(s);
    }
}