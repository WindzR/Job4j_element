package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        int[] temp = new int[data.length];
        for (int index = 0; index < data.length; index++) {
            temp[index] = data[index];
            if (temp[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
