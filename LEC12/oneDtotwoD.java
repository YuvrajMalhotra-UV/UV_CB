package LEC12;

public class oneDtotwoD {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int rows = 2;
        int cols = 3;
        
        int[][] converted = convert1DTo2D(original, rows, cols);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(converted[i][j] + " ");
            }
            System.out.println();
        }
    

    public static int[][] convert1DTo2D(int[] original, int rows, int cols) {
        if (original.length != rows * cols) {
            throw new IllegalArgumentException("Invalid array length");
        }
        
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = original[i * cols + j];
            }
        }
        return result;
    }
    }
}
}

