import java.util.*;
public class Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer> eve=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            if(arr.get(i)%2==0){
                eve.add(arr.get(i));
            }
            else
            odd.add(arr.get(i));
        }
        for(int i=0;i<odd.size();i++){
            System.out.print(odd.get(i)+" ");
        }
        for(int i=0;i<eve.size();i++){
            System.out.print(eve.get(i)+" ");
        }
    }
}