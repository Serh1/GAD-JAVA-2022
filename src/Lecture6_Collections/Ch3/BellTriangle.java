package Lecture6_Collections.Ch3;

public class BellTriangle {
    private final int height;

    public BellTriangle(int height) {
        this.height = height;
    }

    public void solution() {
        int[][] arr = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0)
                    arr[i][j] = 1;
                if (i != 0)
                    if (j == 0)
                        arr[i][j] = arr[i - 1][i - 1];
                    else
                        arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];

                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new BellTriangle(5).solution();
    }
}
