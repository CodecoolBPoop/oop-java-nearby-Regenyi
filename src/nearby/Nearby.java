package nearby;

import java.util.Arrays;

public class Nearby {

    public static void main(String[] args){
        ArrayChecker list = new ArrayChecker();
        int[] result = list.nearby(4,0, 18);
        System.out.println(Arrays.toString(result));
    }
}
