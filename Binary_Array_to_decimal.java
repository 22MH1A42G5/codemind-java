import java.util.*;
public class Decimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
        for(int i:arr){
            num=num*10+i;
        }
        String s=Integer.toString(num);
        System.out.println(Integer.parseInt(s, 2));
    }
}