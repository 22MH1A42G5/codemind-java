import java.util.Scanner;
public class capacity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(t*s*b*1024);
    }
}