import java.util.Scanner;
public class Cars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        int a=x,b=0,c=0;
        if(n1>=n2){
            System.out.println("-1");
        }
        else if(n1<n2){
            while(a>=b){
                a=n1+a;
                b=n2+b;
                c++;
            }
            System.out.println(c);
        }
    }
}