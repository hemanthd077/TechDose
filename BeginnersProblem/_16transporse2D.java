package BeginersProblem;
import java.util.Scanner;


public class _16transporse2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i!=j){
                    arr[i][j]^=arr[j][i];
                    arr[j][i]^=arr[i][j];
                    arr[i][j]^=arr[j][i];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }    
}
