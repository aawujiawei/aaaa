package com.jw.test;
public class Test {
    public static int findCircleCount(int[][] list) {
        boolean[] isVisited = new boolean[list.length];
        int count=0;

        for(int i=0;i<list.length;i++){
            if(!isVisited[i]){
                dfs(list,i,isVisited);
                count++;
            }
        }
        return count;
    }

    static void dfs(int[][] list, int i, boolean[] isVisited){
        isVisited[i]=true;
        for(int j=0;j<list[0].length;j++){
            if(list[i][j]==1&& isVisited[j]==false){
                dfs(list,j,isVisited);
            }
        }
    }

    public static void main(String[] args) {
        int [][] test1={{1,1,0},{1,1,0},{0,0,1}};
        int [][] test2={{1,1,0},{1,1,1},{0,1,1}};
        int res1= findCircleCount(test1);
        int res2 =findCircleCount(test2);
        System.out.println("示例一结果："+res1);
        System.out.println("示例二结果："+res2);
    }
}
