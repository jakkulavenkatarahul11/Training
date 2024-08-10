public class matrix {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Get the number of rows and columns
        int rows = array2D.length;
        int cols = array2D[0].length;
        
        // Linearizing and printing the 2D array using one for loop
        for (int i = 0; i < rows * cols; i++) {
            // Compute the row and column indices
            int rowIndex = i / cols;
            int colIndex = i % cols;
            
            // Print the element
            System.out.print(array2D[rowIndex][colIndex] + " ");
        }
    }
}