import java.util.*;

public class QuickSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quick(arr, 0, n-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
    public static void quick(int arr[],int start,int end){
        if(start<end){
            int part=partition(arr,start,end);
            quick(arr, start, part-1);
            quick(arr, part+1, end);
        }
    }
    public static int partition(int arr[],int start,int end){
        int i= (start-1);
        int p = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<p){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t=arr[end];
        arr[end]=arr[i+1];
        arr[i+1]=t;
        return i+1;
    }
}