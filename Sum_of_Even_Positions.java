import java.util.Scanner;
public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}