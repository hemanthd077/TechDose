package BeginnersProblem;

import java.util.*;

public class _2GCD2Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        _2GCD2Numbers a= new _2GCD2Numbers();
        System.out.println(a.find(num1,num2));
    }
    public int find(int n1,int n2){
        return (n1==0)? n2 :find(n2%n1, n1);
    } 
}
