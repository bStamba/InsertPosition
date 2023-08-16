public class SearchingInsert {

    //Object is to find the index where our target value should be inserted into our integer array.
    public int searchInsert(int[] nums, int target) {

        int leftBound = 0;
        int rightBound = nums.length - 1;
        int middle = nums.length / 2;

        while (leftBound <= rightBound) {

            //If target is found at middle, then return middle as our index.
            //If target is > element at middle, then make left bound = middle + 1, and update our middle
            //If target is < element at middle, then make right bound = middle - 1, and update our middle. 
            if (target == nums[middle]) {
                return middle;
            }
            else if (target > nums[middle]) {
                leftBound = middle + 1;
                middle = leftBound + (rightBound - leftBound) / 2;
            }
            else{
                rightBound = middle - 1;
                middle = leftBound + (rightBound - leftBound) / 2;
            }
        }
        return leftBound;
    }
}
