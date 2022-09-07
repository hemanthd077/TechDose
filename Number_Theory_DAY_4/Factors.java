// Finding factors of a number.

import java.util.*;

class Find{
    public void Factor(long N){
       for(int i=1;i*i<=N;i++){
           if(N%i == 0){
               System.out.print(i+" ");
               if(N/i != i){
                   System.out.print(N/i+" ");
               }
           }
       }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Num:");
        long N=sc.nextInt();
        
        Find a = new Find();
        System.out.println("The output:");
        a.Factor(N);
    }
}