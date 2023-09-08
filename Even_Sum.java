import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i%2==0){
                s+=i;
            }
        }
        System.out.println(s);
    }
}