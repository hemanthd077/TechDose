//Merge Sort.

import java.util.*;

public class MergeSort {
    private static int n;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MSort(arr, 0, n-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void MSort(int[] a,int low,int high){
        if(high == low){
            return;
        }
        int mid=low+(high - low)/2;
        MSort(a,low,mid);
        MSort(a,mid+1,high);
        Merge(a,high,mid,low);
    }
    public static void Merge(int[] a,int high,int mid,int low){
        int i=low,j=mid+1;
        int arr[] = new int[high+1];
        int k=low;
        while(i<=mid && j<=high){
            if(a[i]>a[j]){
                arr[k++]=a[j];
                j++;
            }
            else{
                arr[k++]=a[i];
                i++;
            }
        }
        while(i<=mid){
            arr[k++]=a[i++];
        } 
        while(j<=high){
            arr[k++]=a[j++];
        }
        for(int ind=low;ind<=high;ind++){
            a[ind]=arr[ind];
        }
    }
}
