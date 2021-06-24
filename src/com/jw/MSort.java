package com.jw;

import java.util.Arrays;

/**
 * @ClassName MSort
 * @Description TODO
 * @Author asus
 * @Date 2021/6/14 下午 05:52
 * @Version 1.0
 **/
public class MSort {
    public static int foundSort(int[] nums){
        int[] nums1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums1);
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]==nums1[left]){
                left++;
            }
            if(nums[right]==nums1[right]){
                right--;
            }
            if(nums[left]!=nums1[left]&&nums[right]!=nums1[right]){break;}
        }
        if(right<=left){return 0;}
        return right-left+1;
    }

    public static void main(String[] args) {
        int [] nums0={2,6,4,8,10,9,15};
        int [] nums1={1,2,3,4};
        int [] nums2={1};
        int [] nums3={};
        int [] nums4={1,2,3,4,5};
        int [] nums5={1,2,3,2,4};
        System.out.println("最短连续无序子数组长度为："+foundSort(nums0));
    }
}
