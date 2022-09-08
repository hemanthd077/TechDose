// Finding NcR.

import java.util.*;

class Find1{
    public int fact(int N){
        if(N==0){
            return 1;
        }
        int res=1;
        for(int i=2;i<=N;i++){
            res*=i;
        }
        return res;
    }
    public int ncr(int N,int R){
        return fact(N) / (fact(R)*fact(N-R));
    }
}

class ncrProblem {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int N=sc.nextInt();
       
        System.out.println("Enter the R:");
        int R=sc.nextInt();
       
        Find1 a = new Find1();
        System.out.println("The output = "+a.ncr(N,R));
    }
}