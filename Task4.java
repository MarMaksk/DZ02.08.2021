package com.company;

public class Task4 {
    public static void main(String[] args) throws NotSortedException {
        System.out.println(binarySearch(5, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    static int binarySearch(int eSearch, int... mass) throws NotSortedException {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1])
                throw new NotSortedException("Massive not sorted");
        }
        int pos = -1;
        for (int array : mass) {
            pos++;
            if (array == eSearch)
                break;
        }
        return pos;
    }
}

class NotSortedException extends Exception {
    public NotSortedException() {
    }

    public NotSortedException(String message) {
        super(message);
    }
}
