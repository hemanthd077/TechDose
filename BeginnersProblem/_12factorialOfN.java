package BeginnersProblem;


import java.util.*;

class _12factorialOfN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        System.out.print(res);
    }
}
