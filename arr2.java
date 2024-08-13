import java.util.Scanner;

class arr2
{
	public static void main (String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Read the number of elements

        int[] arr = new int[N]; // Create an array with size N

        // Read the N space separated integers and store them in the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int X = scanner.nextInt(); // Read the integer X
        
        int newSize = 0; // New size of the updated list

        // Iterate through the array and copy non-X elements to a new array
        for (int i = 0; i < N; i++) {
            if (arr[i] != X) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        // Output the updated list
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

	}
}
