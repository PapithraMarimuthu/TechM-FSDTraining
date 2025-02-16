package threads;
class MatrixMultiplier extends Thread {
    private int[][] A, B, C;
    private int row, col, size;

    public MatrixMultiplier(int[][] A, int[][] B, int[][] C, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    @Override
    public void run() {
        for (int k = 0; k < size; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}
