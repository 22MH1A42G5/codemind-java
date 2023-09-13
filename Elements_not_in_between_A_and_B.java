import java.util.*;
public class Between{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        ArrayList<Integer> arr=new ArrayList<Integer>(); 
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr.get(i)<a || arr.get(i)>b){
                System.out.print(arr.get(i)+" ");
                c=1;
            }
        }
        if(c!=1)
        System.out.println(-1);
    }
}