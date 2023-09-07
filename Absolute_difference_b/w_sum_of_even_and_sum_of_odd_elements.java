import java.util.Scanner;
public class Absolute{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ev=0,od=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i%2==0){
                ev+=i;
            }
            else{
                od+=i;
            }
        }
        System.out.println(Math.abs(ev-od));
    }
}