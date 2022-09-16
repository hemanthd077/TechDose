import java.util.*;

public class RadixSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        check obj =new check();
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int max=obj.fmax(arr,n);
        for(int i=1;max/i>0;i*=10){
            obj.CountingSort(arr,n,i);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

class check{
    int fmax(int arr[],int len){
        int max=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    void CountingSort(int arr[],int size,int place){
        int freq[] = new int[10]; 
        for(int i=0;i<size;i++){
            freq[(arr[i]/place)%10]++;
        }
        int cumfreq[] = new int[10];
        cumfreq[0]=freq[0];
        int ans[] = new int[size];
        for(int i=1;i<10;i++){
            cumfreq[i]+=freq[i]+cumfreq[i-1];
        }
        for(int i=size-1;i>=0;i--){
            int val=cumfreq[(arr[i]/place)%10];
            cumfreq[(arr[i]/place)%10]--;
            ans[val-1]=arr[i];
        }
        for(int i=0;i<size;i++){
            arr[i]=ans[i];
        }
    }
}
