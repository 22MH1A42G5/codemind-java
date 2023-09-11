import java.util.*;
public class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int t=sc.nextInt();
        int ans=Collections.frequency(arr,t);
        System.out.println(ans);
    }
}