package Lecture1.Ch3;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr));
            for (int j = i+1; j < arr.length - 1; j++) {
                if(arr[i] + arr[j] == 0 && arr[i]!=0 &&  arr[j]!=0 ){
                    count++;
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, -5, 7, -5}));
    }


}
