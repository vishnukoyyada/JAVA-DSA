package Arrays;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int[] nums1= {3,4,5,6,7,8};
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i =0;i<nums.length;i++){
        ans.add(nums[i]);
       }
       for(int i = 0;i<nums1.length;i++){
        if(search(nums, nums1[i])){
        }else{
            ans.add(nums1[i]);
        }

       }
       for(int num:ans){
        System.out.println(num);
       }


    }
    static boolean search(int[] arr, int num){
        boolean ans = false;
        for(int temp:arr){
            if(temp == num){
                ans = true;
                break;
            }
        }

        return ans;
    }
}
