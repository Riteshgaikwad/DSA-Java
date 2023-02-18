/*
Q:-Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct. 

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

*/
public class basics {
  public static boolean duplicate(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          return true;
        }
      }
    }
    return false;
  }
   public static void main(String[] args) {
      int marks[]={-2,-3,4,-1,-2,1,5,-3};
     if(duplicate(marks)){
      System.out.println("Contains Duplicates!");
     }
     else{
      System.out.println("Do not contain Duplicates!");
     }
     
   }
}

/*
Question 2: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity. 
Example 1:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4
Example 2:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
Output: -1
*/
