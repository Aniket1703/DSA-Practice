package com.BinarySearch.BinarySearch.BinarySearchQuestions;

public class RotatedArrayBS {
    public static void main(String[] args) {
        int[] nums = { 8,9,1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target) {
        int pivet = getPivet(nums);


        int ans = BinarySearch(nums,target,0,pivet);
        if(ans == -1){
            ans = BinarySearch(nums,target,pivet+1,nums.length -1);
        }
        return ans;
    }

    static int getPivet(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            } if( mid > start && nums[mid]< nums[mid -1]){
                return  mid -1;
            }
            if(nums[mid] < nums[start]){
                end = mid -1;
            }else{
                start= mid + 1;
            }
        }
        return -1;
    }

    static int  BinarySearch(int[] nums, int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid]> target){
                end = mid -1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
