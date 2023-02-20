import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] test = {"test", "asdf"};
        int[] test1 = new int[6];
        for (int i = 0; i < 6; i++) {
            test1[i] = i;
        }

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test1));
    }
}
