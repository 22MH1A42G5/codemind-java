import java.util.*;
public class avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int avg=0;
        int c=0;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
        }
        avg=sum/n;
        for(int i:arr){
            if(i>=avg)
            c++;
        }
        System.out.println(c);
    }
}