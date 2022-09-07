// Finding NcR.

import java.util.*;

class Find{
    public long fact(long N){
        if(N==0){
            return 1;
        }
        long res=1;
        for(int i=2;i<=N;i++){
            res*=i;
        }
        return res;
    }
    public long ncr(long N,long R){
        return fact(N) / (fact(R)*fact(N-R));
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the N:");
        long N=sc.nextInt();
       
        System.out.println("Enter the R:");
        long R=sc.nextInt();
       
        Find a = new Find();
        System.out.println("The output = "+a.ncr(N,R));
    }
}