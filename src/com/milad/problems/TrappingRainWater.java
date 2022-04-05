package com.milad.problems;

// https://leetcode.com/problems/trapping-rain-water

public class TrappingRainWater {
    public int trap(int[] height) {
        int totalWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                if (height[leftPointer] < maxLeft) {
                    totalWater += maxLeft - height[leftPointer];
                } else {
                    maxLeft = height[leftPointer];
                }
                leftPointer++;
            } else {
                if (height[rightPointer] < maxRight) {
                    totalWater += maxRight - height[rightPointer];
                } else {
                    maxRight = height[rightPointer];
                }
                rightPointer--;
            }
        }

        return totalWater;
    }
}
