import java.util.Scanner;
public class patt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=65;i<65+n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%c ",i);
            }
            System.out.println();
        }
    }
}