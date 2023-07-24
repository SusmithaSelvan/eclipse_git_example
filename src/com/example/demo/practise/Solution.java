package com.example.demo.practise;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positiveNumberCount = 0, negativeNumberCount = 0, equalNumberCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positiveNumberCount = positiveNumberCount + 1;
            } else if (arr.get(i) == 0) {
                equalNumberCount = equalNumberCount + 1;
            } else {
                negativeNumberCount = negativeNumberCount + 1;
            }
        }
        
        double d = (double)arr.size();
        System.out.println(positiveNumberCount / d);
        System.out.println(equalNumberCount / d);
        System.out.println(negativeNumberCount / d);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        int n=5;
        List<Integer> list = Arrays.asList(1, 1, 0, -1, -1);

        Result.plusMinus(list);
    }
}
