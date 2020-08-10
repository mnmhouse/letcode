package com.putact.buzz;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CityHight {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        List<List<Integer>> groups = new ArrayList<List<Integer>>();

        int size = groupSizes.length;

        for (int i = 0; i < size; i++) {
            if (groupSizes[i] == 0) {
                continue;
            }

            int value = groupSizes[i];

            List<Integer> groupItem = new ArrayList<>();

            for (int j = i + 1; j < size; j++) {

                if (groupItem.size() == value) {
                    groups.add(groupItem);
                    break;
                } else {
                    if (groupSizes[j] == value) {
                        groupItem.add(j);
                        groupSizes[j] = 0;
                    }
                }

            }

        }
      return  groups;

    }




        public static int maxIncreaseKeepingSkyline(int[][] grid) {


        int count = 0;
        int n = grid.length;
        int m = grid[0].length;

        int[] rows = new int[n];
        int[] colums = new int[m];


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                rows[i] = Math.max(grid[i][j], rows[i]);
                colums[i] = Math.max(grid[j][i], colums[i]);

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += Math.min(rows[i], colums[j]) - grid[i][j];
            }
        }

        return count;
    }

    public static void main(String args[]) {
        String dd ="ll";
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.print(maxIncreaseKeepingSkyline(grid));
    }

}

