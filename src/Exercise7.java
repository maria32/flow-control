/**
 * Created by martanase on 10/27/2016.
 */
public class Exercise7 {

    public int sumHeights(int[] heights, int start, int end){
        //if start<heights.length && end>start && end<=heights.length
        int sum = 0;
        if (start < heights.length && end > start && end <= heights.length) {
            for (int i = start + 1; i <= end; i++) {
                sum = sum + Math.abs(heights[i - 1] - heights[i]);
            }
        }
        return sum;
    }
}
