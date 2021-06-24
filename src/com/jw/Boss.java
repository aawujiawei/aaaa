package com.jw;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Boss
 * @Description TODO
 * @Author asus
 * @Date 2021/6/14 下午 12:47
 * @Version 1.0
 **/
public class Boss {
    public static int[][] overTurn(int[][] list){
        for(int i=0;i<list.length;i++){
            int left=0,right=list[i].length-1;
            while(left<right){
                int temp=list[i][left]^1;
                list[i][left]=list[i][right]^1;
                list[i][right]=temp;
                left++;
                right--;
            }
            if(list[i].length%2!=0)
                list[i][left]^=1;
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] list={{1,1,0},{1,0,1},{0,0,0}};
        int[][] list1={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] list2={};
        int[][] ints = overTurn(list2);
        for(int i=0;i<ints.length;i++)
            System.out.println(Arrays.toString(ints[i]));
        if(ints.length==0) System.out.println("矩阵为空");
    }
}
