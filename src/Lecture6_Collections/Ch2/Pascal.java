package Lecture6_Collections.Ch2;

public class Pascal {
    private final int height;

    public Pascal(int depth) {
        this.height = depth;
    }

    public void solution() {
        int[][] arr = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pascal(5).solution();
    }
}