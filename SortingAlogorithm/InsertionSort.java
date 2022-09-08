//Insertion sort.

import java.util.*;

public class InsertionSort {
    private static int n;
    private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int val=arr[i];
            int j=i-1;
            for(j=i-1;j>=0;j--){
                if(arr[j]>val){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=val;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
