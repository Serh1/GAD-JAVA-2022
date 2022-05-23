//package Lecture6.Ch6;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class MatrixSpiral {
//    public static List<Integer> displaySpiral(Integer[][] matrix) {
//        List<Integer> ans = new ArrayList<Integer>();
//
//        if (matrix.length == 0)
//            return ans;
//
//        int R = matrix.length, C = matrix[0].length;
//        boolean[][] seen = new boolean[R][C];
//        int[] dr = { 0, 1, 0, -1 };
//        int[] dc = { 1, 0, -1, 0 };
//        int r = 0, c = 0, di = 0;
//
//        // Iterate from 0 to R * C - 1
//        for (int i = 0; i < R * C; i++) {
//            ans.add(matrix[r]);
//            seen[r] = true;
//            int cr = r + dr[di];
//            int cc = c + dc[di];
//
//            if (0 <= cr && cr < R && 0 <= cc && cc < C
//                    && !seen[cr][cc]) {
//                r = cr;
//                c = cc;
//            } else {
//                di = (di + 1) % 4;
//                r += dr[di];
//                c += dc[di];
//            }
//        }
//        return ans;
//    }
//
//
//
//    public static void main(String[] args) {
//        Integer[][] matrix = new Integer[4][4];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[i][j] = i+10;
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//        displaySpiral(matrix);
//    }
//}
