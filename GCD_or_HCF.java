import java.util.Scanner;
public class Hcf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int maxi=0;
        int max=(a>b)?a:b;
        for(int i=1;i<max;i++){
            if(a%i==0 && b%i==0){
                if(i>maxi){
                    maxi=i;
                }
            }
        }
        System.out.println(maxi);
    }
}