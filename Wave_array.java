import java.util.*;
public class WaveArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        if(arr[0]>arr[1])
        c=0;
        else
        c=1;
        if(c==0){
            for(int i=0;i<n-1;i++){
                if(i%2==0){
                    if(arr[i]<arr[i+1]){
                        System.out.println("no");
                        return;
                    }
                }
            }
        }
        else{
            for(int i=0;i<n-1;i++){
                if(i%2==0){
                    if(arr[i]>arr[i+1]){
                        System.out.println("no");
                        return;
                    }
                }
            }
        }
        System.out.println("yes");
    }
}