import java.util.Scanner;
public class mirrornumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int t = sc.nextInt();
        System.out.print("Enter  values : ");
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(-n);
        }
    }
}