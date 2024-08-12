import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        boolean isPrime = true;
        int i;
        i=2;
        while(i < n){
            if(n%2 == 0){
                isPrime=false;
            }
            i++;
        }
        if(isPrime){
            System.out.println("the given number " +n+ " is Prime");
        }
        else{
            System.out.println("the given number " +n+ " is a composite number");
        }
    }
}
