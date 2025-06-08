package com.BinarySearch.BinarySearch.BinarySearchQuestions;

public class mountainArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,3,2,1};
        int target = 3;
        System.out.println(findInMountainArray(target,arr));
    }

    //https://leetcode.com/problems/find-in-mountain-array/description/
    static int findInMountainArray(int target, int[] arr) {
        int start= 0;
        int end = arr.length -1;
        int peak = findPeak(arr,start,end);

        int result = BinarySearch(arr,start,peak,target);
        if(result != -1){
            return  result;
        }
        result = OrderAgnosticBS(arr,peak,end,target);
        return result;
    }

    static int findPeak(int[] arr,int start,int end){

        while(start< end ){
            int mid = start +( end - start)/2;
            if(arr[mid] > arr[mid +1]){
                end = mid;
            }else{
                start = mid+ 1;
            }
        }
        return start;

    }

    static int BinarySearch(int[] arr,int start,int end, int target){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int OrderAgnosticBS(int[] arr,int start,int end, int target){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                start = mid + 1;
            }else if(arr[mid] < target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
