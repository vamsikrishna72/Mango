package com.mango;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        // ascending order
        insertionSort.insertionSortAscending(array);

        // descending order
        insertionSort.insertionSortDescendig(array);
    }

    private void insertionSortDescendig(int[] rawlist) {
        int length = rawlist.length;
        for (int i = length - 1; i > 0; i--) {
            int value = rawlist[i - 1];
            int j = i;
            for (; j >= 0 && j <= length - 1 && value < rawlist[j]; j++) {
                rawlist[j - 1] = rawlist[j];
            }
            rawlist[j - 1] = value;
        }
        for (int x = 0; x < rawlist.length; x++) {
            System.out.print(rawlist[x] + ", ");
        }
    }

    public void insertionSortAscending(int rawList[]) {
        int length = rawList.length;
        for (int i = 1; i < length; i++) {
            int value = rawList[i];
            int j = i - 1;
            for (; j >= 0 && value < rawList[j]; j--) {
                rawList[j + 1] = rawList[j];
            }
            rawList[j + 1] = value;
        }

        for (int x = 0; x < rawList.length; x++) {
            System.out.print(rawList[x] + ", ");
        }

    }
}
