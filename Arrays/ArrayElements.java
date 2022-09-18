package Arrays;

import java.util.Scanner;

public class ArrayElements {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        char arr[] = new char[n];
        int count[] = new int[256];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
            count[arr[i]]++;
        }
        for(int i=0;i<256;i++){
            if(count[i]>=(n/k)){
                System.out.print((char)i+" ");
            }
        }
    }
}
