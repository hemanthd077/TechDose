//Bubble Sort

import java.util.*;

public class BubbleSort {
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
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]^=arr[j+1];
                    arr[j+1]^=arr[j];
                    arr[j]^=arr[j+1];
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
