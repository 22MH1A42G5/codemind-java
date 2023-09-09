import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i:arr){
            s+=i;
        }
        int avg=s/n;
        String ans=arr.contains(avg)?"True":"False";
        System.out.println(ans);
    }
}
