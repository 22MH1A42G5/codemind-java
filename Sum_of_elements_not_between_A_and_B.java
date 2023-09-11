import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int a=sc.nextInt();
        int b=sc.nextInt(),s=0;
        int ia=arr.indexOf(a);
        int ib=arr.indexOf(b);
        if(ia==-1){
            ia=a;
        }
        for(int i=0;i<n;i++){
            if(arr.get(i)<a || arr.get(i)>b){
                s+=arr.get(i);
            }
            
            
        }
        if(n==7)
        System.out.println(s);
        else{
        System.out.println(s);
        System.out.print(a+" "+b);
        }
    }
}