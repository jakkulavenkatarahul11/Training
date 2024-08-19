import java.util.Scanner;
public class mirrorstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            String a = sc.next();
            String b = a + a;
            System.out.print(b);
        }

    }
}
