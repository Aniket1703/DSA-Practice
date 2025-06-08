package com.BinarySearch.BinarySearch.BinarySearchQuestions;

public class findPeakElement {

    public static void main(String[] args){
        int[] nums = { 1,2,3,4,5,6,3,2};
        System.out.println(findpeakElement(nums));
    }

    static int findpeakElement(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        while(start < end){
            int mid = start +(end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                end= mid ;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
}
