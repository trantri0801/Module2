package Sort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 1, 6, 0, -2, 9, 25, -10};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }
}
