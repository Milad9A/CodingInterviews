package com.milad.problems;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                int currentMapVal = numsMap.get(nums[i]);


                return new int[]{currentMapVal, i};
            } else {


                int numberToFind = target - nums[i];
                numsMap.put(numberToFind, i);
            }
        }
        return null;
    }
}

