package threads;

public class MultiThreadMatrixMultiplication {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };
        int[][] C = new int[2][2];

        int size = A.length;
        Thread[][] threads = new Thread[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j] = new MatrixMultiplier(A, B, C, i, j, size);
                threads[i][j].start();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j].join();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

