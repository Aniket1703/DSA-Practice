public class findCeiling {

    public static void main(String[] args){
        int[] arr ={1,11,22,33,44,55,66,77,88,99,100};
        int target = 17;
        System.out.println(FindCeiling(arr,target));
    }

    //Method to find the biggest number closest to the target
    static int FindCeiling(int[] arr, int target){
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
        return start;
    }
}
