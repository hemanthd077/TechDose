
import java.util.*;

public class BucketSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bucket(arr,n);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void Bucket(int arr[],int size){
        List<List<Integer>> a = new ArrayList<>(); 

        for(int i=0;i<size;i++){
            a.add(new ArrayList<>());
        }
        for(int i : arr){
            int pos= i/size>=0 ? i/size : 0;
            a.get(pos).add(i);
        }
        int ind=0;
        for(List<Integer> i : a){
            Collections.sort(i);
            for(int j : i){
                arr[ind++]=j;
            }
        }
    }
}
