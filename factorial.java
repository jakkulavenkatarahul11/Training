import java.util.Scanner;
public class factorial {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter the n value : ");
    n = sc.nextInt();
    int fact=1;
    int i = 1;
    while(i<=n){
        fact *= i;
        i++;
    }
    System.out.println("The factorial of given number is : "+fact);
   } 
}
