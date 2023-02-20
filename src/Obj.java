import com.test.Cat;

import java.util.Arrays;

public class Obj {

    public static void main(String[] args) {
        Cat cat1 = new Cat("test");
        cat1.getName();
        Cat cat2 = new Cat("test2");
        cat2.getName();

        cat1.setName(1,2,3,4);
        System.out.println(cat1.name);

        int[] arr1 = {3, 2, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}

