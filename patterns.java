public class patterns {
    public static void main(String[] args) {
        pattern3(4);
    }

   static void pattern1(int n)
   {
    for(int row = 0 ; row <= n ; row ++)
    {
        for(int col = 0 ; col <= row ; col ++){
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
    }


    static void pattern2(int n)
   {
    for(int row = 0 ; row <= n ; row ++)
    {
        for(int col = 0; col <= n; col ++){
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
    }


    static void pattern3(int n)
   {
    for(int row = 0 ; row <= n ; row ++)
    {
        for(int col = 0 ; col <= row ; col ++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}
