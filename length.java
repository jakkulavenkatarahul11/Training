import java.util.Scanner;
public class length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a integer value : ");
        num = sc.nextInt();
        int count = 0;
        while(num !=0){
            num = num/10;
            count++;
        }
        System.out.println(count + " Integers are present in the given integer value");
    }
}
