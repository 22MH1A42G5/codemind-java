import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==r-1 || j==r-1 || i==0 || j==0){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}