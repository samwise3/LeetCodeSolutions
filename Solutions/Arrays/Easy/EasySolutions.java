class EasySolutions {

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.
*/
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

/* 
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears 
only once. 

The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
- Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
- The remaining elements of nums are not important as well as the size of nums.
- Return k. 
*/
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        // add the last element of the array
        nums[j] = nums[nums.length-1];
        j++;
        return j;
    }

    
}