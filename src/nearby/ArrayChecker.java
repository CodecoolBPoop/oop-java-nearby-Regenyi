package nearby;


import java.util.Arrays;
import java.util.stream.IntStream;


public class ArrayChecker {
    public int[] nearby(int x, int y, int range) {
        int[] row = multi[x];
        int[] pos = Arrays.copyOfRange(row, y+1, y+1+range);
        int[] neg = Arrays.copyOfRange(row, y-range, y);
        int[] result = IntStream.concat(Arrays.stream(neg), Arrays.stream(pos)).toArray();
        return result;
    };

    private int[][] multi = {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };


}
