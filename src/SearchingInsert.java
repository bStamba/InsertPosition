public class SearchingInsert {

    public int searchInsert(int[] nums, int target){

        int index = 0;
        //Traverse the array, if the target is less than or equal to the element at the current index,
        //then we will return the index. If we reach the end of the array and our target is still greater,
        //then we will return the last element + 1.
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i] || target < nums[i]){
                index = i;
                System.out.println("Index is: " + index);
                return index;
            }
            if(i == nums.length - 1){
                return i + 1;
            }
        }
        return index;
    }
}
