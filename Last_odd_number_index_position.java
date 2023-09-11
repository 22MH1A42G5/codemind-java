import java.util.*;
public class Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)%2==1){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}