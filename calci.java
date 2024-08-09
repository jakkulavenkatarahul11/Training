import java.util.Scanner;
public class calci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true)
        {
        System.out.print("Enter any operator : ");
        char op = sc.next().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '*' || op == '%')
        {
            System.out.print("Enter the value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter the evalue of b : ");
            int b = sc.nextInt();
            if(op=='+'){
                ans = a + b;
            }
            if(op=='-'){
                ans = a-b;
            }
            if(op=='*'){
                ans=a*b;
            }
            if(op=='%'){
                ans=a%b;
            }
            if(op=='/'){
                ans=a/b;
            }


        }
        else if(op == 'x' || op == 'X'){
            break;
        }
        else{
            System.out.println("Enter valid inputs!!");
        }
        System.out.println(ans);
        }   
    }
}
