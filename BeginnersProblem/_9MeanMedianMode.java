package BeginnersProblem;

import java.util.*;

public class _9MeanMedianMode {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The mean = "+(sum/(double)n));
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                arr[i]^=arr[minindex];
                arr[minindex]^=arr[i];
                arr[i]^=arr[minindex];
            }
        }
        System.out.println("The Median = "+(double)(arr[n/2]+arr[(n/2)+1])/2.0);
        int max=Arrays.stream(arr).max().getAsInt();
        int count[]=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int mode=0,ind=count[0];
        for(int i=0;i<max;i++){
            if(count[i]>ind){
                ind=count[i];
                mode=i;
            }
        }
        System.out.println("The mode = "+ind);
    }
}
