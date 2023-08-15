import java.util.Scanner;
public class Monopoly{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            int ans=0;
            if(r1>(r2+r3))
            {
                ans=1;
            }
            else if(r2>(r3+r1)){
                ans=1;
            }
            else if(r3>(r1+r2)){
                ans=1;
            }
            if(ans==1){
                System.out.printf("YES
");
            }
            else{
                System.out.printf("NO
");
            }
            t--;
        }
    }
}