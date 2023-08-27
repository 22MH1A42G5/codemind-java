import java.util.Scanner;
public class pretty{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cnt=0;
            for(int i=a;i<=b;i++){
                if(i%10==2 || i%10==3 || i%10==9){
                    cnt++;
                }
            }
            System.out.println(cnt);
            t-=1;
        }
    }
}