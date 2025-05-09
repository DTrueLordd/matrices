import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,1},
                {4,2,2},
                {0,1,7},

        };
        int[][] B = {
                {7,5,1},
                {2,1,2},
                {4,3,4},

        };

       int[][] C = MultiThreadMultiplier.multiply(A,B);
        int[][] D = Multiplier.multiply(A,B);


        for (int[] ints : C) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();

        for (int[] ints : D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}