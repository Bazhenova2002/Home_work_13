package home.work13;

import java.util.Arrays;

public class IntList {
    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmpArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmpArray, 0, arr.length);
        tmpArray[arr.length] = value;
        arr = tmpArray;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
