import java.util.*;
public class MaxiMini{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,c=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
        for(int i=0;i<n;i++){
            temp=Collections.frequency(arr,arr.get(i));
            if((arr.get(i)==temp) && arr1.contains(arr.get(i))==false){
                arr1.add(arr.get(i));
                c=1;
            }
        }
        if(c==1){
        for(int i=0;i<arr1.size();i++){
            System.out.print(arr1.get(i)+" ");
        }
        }
        else
        System.out.println(-1);
    }
}