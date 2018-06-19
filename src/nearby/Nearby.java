package nearby;

import java.util.Arrays;

public class Nearby {

    public static void main(String[] args){
        ArrayChecker nearby1 = new ArrayChecker();
        int[] result = nearby1.nearby(0,2, 2);
        System.out.println(Arrays.toString(result));

    }
}
