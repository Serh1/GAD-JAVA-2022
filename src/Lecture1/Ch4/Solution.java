package Lecture1.Ch4;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] arr) {
        int count = 0;
        int sum1 = 0,sum = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                sum1 = arr[i]+arr[j];
                for (int k = j+1; k < arr.length ; k++) {
                    sum = sum1 + arr[k];
                    if(arr[i] != 0 && arr[j] != 0 && arr[k] != 0){
                        if (sum == 0) {
                            count++;
                            arr[i] = 0;
                            arr[j] = 0;
                            arr[k] = 0;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, -1, -1, 2}));
    }

}
