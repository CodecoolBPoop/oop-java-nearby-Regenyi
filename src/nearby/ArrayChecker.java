package nearby;

import java.util.ArrayList;

public class ArrayChecker {
    public int[] nearby(int x, int y, int range) {
        if (x > multi.length) {
            System.out.println("nincs ilyen sora a listának!");
            return null;
        }

        int[] row = multi[x];
        int arrayEnd = row.length-1;
        ArrayList<Integer> result = new ArrayList<>();
        //System.out.println("input: " + x + " " + y + " " + range);
        //System.out.println("y = "+ row[y]);

        if (y > arrayEnd) {
            System.out.println("nincs ilyen indexű elem!");
            return null;
        }

        if (y-range <= 0) {
            //System.out.println("range átnyúlik minuszba");
            for (int i = 0; i < ((y-range)+range); i++) {
                result.add(row[i]);
            }
        } else {
            //System.out.println("range lefele belefér a listába");
            for (int i = y - range; i < y; i++) {
                result.add(row[i]);
            }
        }
        if (y+range >= arrayEnd && y < arrayEnd) {
            //System.out.println("range túlnyúlik a listán");
            for (int i = 0; i < (arrayEnd - y); i++) {
                result.add(row[i+y+1]);
            }
        }
        if (y+range < arrayEnd) {
            //System.out.println("range felfele belefér a listába");
            for (int i = 0; i < range; i++) {
                result.add(row[i + y+1]);
            }
        }

        int[] arr = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    };

    private int[][] multi = {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };
}
