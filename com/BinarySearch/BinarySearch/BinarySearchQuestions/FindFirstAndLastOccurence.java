package com.BinarySearch.BinarySearch.BinarySearchQuestions;

import java.util.Arrays;
public class FindFirstAndLastOccurence {

    public static void main(String[] args){
        int[] nums ={1,2,4,4,4,4,5,5,6,6,8,9,9,9,10};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length < 1){
            return ans;
        }
        if(nums[nums.length -1] < target || nums[0] >target){
            return ans;
        }


        ans[0] = findPosition(nums,target,true);
        ans[1] = findPosition(nums,target,false);
        return ans;
    }

    static int findPosition(int[] nums,int target,boolean isTrue){
        int ans=-1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end ){
            int mid = start + (end- start)/2;
            if(nums[mid] > target){
                end =  mid -1;
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                ans = mid;
                if(isTrue){
                    end = mid-1;
                }else{
                    start= mid + 1;
                }
            }
        }
        return ans;
    }
}
