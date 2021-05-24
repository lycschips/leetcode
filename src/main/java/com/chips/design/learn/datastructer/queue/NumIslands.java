package com.chips.design.learn.datastructer.queue;


/**
 * 岛屿数量问题，求出连续的二维数组中岛屿数量
 */
public class NumIslands {


    public void dfs(char[][] grid, int h, int w) {
        int high = grid.length;

        int wide = grid[0].length;

        if (h >= high || w >= wide || h < 0 || w < 0 || grid[h][w] == '0') {
            return;
        }
        grid[h][w] = '0';
        dfs(grid, h + 1, w);
        dfs(grid, h, w + 1);
        dfs(grid, h - 1, w);
        dfs(grid, h, w - 1);

    }


    public int solution(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int high = grid.length;

        int wide = grid[0].length;

        int numsLand = 0;

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < wide; j++) {
                if ('1' == grid[i][j]) {
                    numsLand++;
                    dfs(grid, i, j);
                }
            }
        }
        return numsLand;
    }
}
