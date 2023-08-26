import java.util.Scanner;
public class CarChoice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            double d=sc.nextDouble();
            double p=sc.nextDouble();
            double drs=sc.nextDouble();
            double prs=sc.nextDouble();
            if((d/drs)<(p/prs)){
                System.out.println("1");
            }
            else if((d/drs)>(p/prs)){
                System.out.println("-1");
            }
            else{
                System.out.println("0");
            }
            t--;
        }
    }
}