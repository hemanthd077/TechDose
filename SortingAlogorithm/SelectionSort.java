//Selection sort.

import java.util.*;

class SelectionSort{
    private static int n;
    private static Scanner sc;

    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int minindex=0;
        for(int i=0;i<n-1;i++){
            minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                arr[i]^=arr[minindex];
                arr[minindex]^=arr[i];
                arr[i]^=arr[minindex];
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}