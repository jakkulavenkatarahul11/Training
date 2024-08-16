import java.util.Scanner;
public class method
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        square(a);
    }
    public static void square(int a){
        System.out.print("the square of given number is " + a*a);
    }

}