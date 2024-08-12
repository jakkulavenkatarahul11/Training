// public class array {
//     public static void main(String[] args){
//         int[] array = new int[100];
//         array[0]=0;
//         array[1]=1;
//         array[2]=2;
//         array[3]=3;
//         array[4]=4;
//         int size = 5;
//         int newposition = 2;
//         int newelement = 7;
//         for(int i = size - 1;i>=2;i--){
//             array[i+1]=array[i];
//         }
//         size++;
//         array[newposition]=newelement;
//         for(int i = 0;i<size;i++){
//             System.out.println(array[i]+" ");
//         }
//     }
// }


public class array{
    public static void main(String[] args){
        int[] array = {0,1,2,3,4};
        array[2]=7;
        System.out.println(array[3]);
    }
}