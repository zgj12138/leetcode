package aug2017;
/**
 * Reshape the Matrix
 * 矩阵变形
 * Input: 
 * nums = 
*  [[1,2],
*  [3,4]]
*  r = 1, c = 4
*  Output: 
*  [[1,2,3,4]]
*  两行两列的矩阵变成一行四列
 * @author ZGJ
 * @date 2017年8月4日 下午1:45:12
 */
public class Question566 {
	/**
	 * 矩阵变换，同除同余相等
	 * @param nums
	 * @param r
	 * @param c
	 * @return
	 */
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) return nums;
        
        int[][] res = new int[r][c];
        for (int i = 0;i < r * c;i++) 
            res[i / c][i % c] = nums[i / m][i % m];
        return res;
    }
    /**
     * 简单变换，一行一行复制，一看就懂
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape2(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) return nums;
        
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return result;
    }
}
