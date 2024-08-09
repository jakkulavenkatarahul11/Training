public class reverse {
    public static void main(String[] args){
        int num = 1234;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            count = count * 10 + rem;
        }
    System.out.println("The reverse of the given number is : "+count);
    }
}
