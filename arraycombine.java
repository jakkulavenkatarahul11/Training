public class arraycombine {
    public static void main(String[] args){
        int firstArray[] = new int[100];
        firstArray[0]=0;
        firstArray[1]=1;
        firstArray[2]=2;
        int size1 = 3;
        int secondArray[] = new int[100];
        secondArray[0]=3;
        secondArray[1]=4;
        secondArray[2]=5;
        secondArray[3]=6;
        int size2 = 4;
        int MergedSize = size1 + size2;
        int MergedArray[] = new int [MergedSize];
        for(int i =0;i<size1;i++){
            MergedArray[i]=firstArray[i];
        } 
        for(int i=0;i<size2;i++){
            MergedArray[size1+i]=secondArray[i];
        }
        for(int i =0;i< MergedSize ;i++){
            System.out.print(MergedArray[i] + " ");
        }

    }
}
