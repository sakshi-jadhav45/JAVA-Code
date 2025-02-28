import java.util.*;
public class _2PrimeNumber {
    public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        n=sc.nextInt();
        boolean prime=true;
        if(n==1){
            System.out.println("1 is not prime or not composiote Number");
        }
        else if(n==2){
            System.out.println("2 is prime number");
        }
        else{
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
System.out.println(n+"is Prime Number");
        }
        else{
            System.out.println(n+"is not Prime Number");  
        }

    }sc.close();
}
}
