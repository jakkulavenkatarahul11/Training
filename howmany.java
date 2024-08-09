public class howmany {
    public static void main(String[] args){
        int n = 99899;
        int count = 0;
        while(count <= n){
            int rem = n % 10;
            if(rem == 8){
                count++;
            }
        n = n / 10;
        }
    System.out.println(count);
    }
}
