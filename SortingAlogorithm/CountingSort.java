import java.util.*;

public class CountingSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[100]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
        }
        int ans[] = new int[n];
        int cumfreq[] = new int[100];
        cumfreq[0]=freq[0];
        for(int i=1;i<100;i++){
            cumfreq[i]+=freq[i]+cumfreq[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int val=cumfreq[arr[i]];
            cumfreq[arr[i]]--;
            ans[val-1]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
