package com.milad.problems;

// https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxContainerArea = 0;
        int pointer1 = 0;
        int pointer2 = height.length - 1;

        while (pointer1 < pointer2) {
            maxContainerArea = Math.max(maxContainerArea, calculateArea(height[pointer1], pointer1, height[pointer2], pointer2));
            if (height[pointer1] < height[pointer2]) {
                pointer1++;
            } else {
                pointer2--;
            }
        }
        return maxContainerArea;
    }

    public int calculateArea(int firstLineH, int firstLineI, int secondLineH, int secondLineI) {
        int containerHeight = Math.min(firstLineH, secondLineH);
        int containerWidth = secondLineI - firstLineI;
        return containerHeight * containerWidth;
    }
}
