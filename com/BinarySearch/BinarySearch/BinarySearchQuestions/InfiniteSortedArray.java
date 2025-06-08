package com.BinarySearch.BinarySearch.BinarySearchQuestions;

public class InfiniteSortedArray {

    public static void main(String[] arr){


    }

    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    static int findPosition(int[] arr, int target ){
        int start = 0;
        int end = 1;
        int ans= -1;

        while(target > arr[end]){
            int newStart = end + 1;
             end = start + (end-start + 1)* 2;
             start = newStart;
        }
        ans = BinarySearch(arr,target,end,start);
        return ans;
    }

    static int BinarySearch( int[] arr,int target,int end,int start){
        while(start <= end){
            int mid =  start + (end -start)/2;

            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
