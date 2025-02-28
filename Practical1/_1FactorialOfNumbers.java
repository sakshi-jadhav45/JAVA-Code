 import java.util.*;
class _1FactorialOfNumbers{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to find factorial");
        n=sc.nextInt();
        int fact=1;
        if(n==0){
            fact=0;
        }
        else{
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }}
        System.out.println("Factorial Of Number "+n+" is :"+fact);
        sc.close();

    }
}