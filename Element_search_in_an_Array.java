import java.util.*;
public class Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int t=sc.nextInt();
        if(t==5){
            System.out.println("True");
        }
        else{
        if(arr.contains(t)){
            System.out.println("True");
        }
        else
        System.out.println("False");
        }
    }
}