package com.BinarySearch.BinarySearch.BinarySearchQuestions;

public class findFloor {
    public static void main(String[] args){
        int[] arr ={1,11,22,33,44,55,66,77,88,99,100};
        int target = -1;
        System.out.println(FindFloor(arr,target));
    }

    //Method to find the smallest number closest to the target
    static int FindFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target > arr[arr.length -1]){
            return -1;
        }

        while( start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end= mid -1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }

}
