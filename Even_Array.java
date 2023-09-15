import java.util.*;
public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i :arr){
            if(i%2!=0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}