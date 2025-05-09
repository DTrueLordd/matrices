public class MultiThreadMultiplier extends Multiplier{


    public static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length; //Количество строк
        int n = A[0].length;    //Столбцов
        int p = B[0].length;

        Thread[] threads = new Thread[m];
        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {

            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < p; j++) {

                    for (int k = 0; k < n; k++) {
                        C[row][j] += A[row][k] * B[k][j];
                    }
                }
            });
            threads[i].start();

        }

        for(int i = 0; i<m; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        return C;
    }

}
