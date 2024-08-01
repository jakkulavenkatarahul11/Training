package Training;
// armstronf program :-
// public class jul25 {
//     public static void main(String[] args) {
//         int n = 1634, am = 0 , temp ;
//         int org = n;
//         while ( n > 0){
//             temp = n % 10 ;
//             temp = temp * temp * temp * temp;
//             am = am + temp;
//             n = n / 10;
//         }
//         if( org == am){
//             System.out.println("given is a armstrong number");
//         }
//         else {
//             System.out.println("given is not a armstrong number");
//         }
//     }
// }


// public class jul25{
//     public static void main(String[] args) {
//         System.out.println("rahul");
//     }
// }


// import java.util.Scanner;
// public class  jul25{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = a + b ;
//         System.out.println("the addition of " +a+ " and " +b+ " is " +c);
//     }
// }
import java.util.Scanner;
public class jul25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int c;
        int end = (n+2)/2;
        for(r=1;r<=n+1;r++){
            System.out.print("");
            for(c=1;c<=end;c++){
                if(r==1){
                    if(c==1 || c== end){
                        System.out.print("");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(r==end){
                    System.out.print("*");
                }
                else{
                    if(c==1 || c==end){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("");
                    }
                }

    
                
            }
        }
    }
}


