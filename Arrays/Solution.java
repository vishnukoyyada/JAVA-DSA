package Arrays;

import java.util.ArrayList;

public class Solution{
    public static void main(String[] args) {
        int[] arr1= {1,1,2,3,4,5};
        int[] arr2 = {1,1,2,2,2,3};
        int i =0,j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr1.length,m = arr2.length;
        while(i < n && j<m) {
            if (arr1[i] <= arr2[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
            while(i<n){
                if(ans.isEmpty() || ans.get(ans.size() -1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }
            while(j<m){
                if(ans.isEmpty() || ans.get(ans.size() -1) != arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }

        for(int num:ans){
            System.out.println(num);
        }
    }
}