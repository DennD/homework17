package ru.geekbrains.oskin_di;

import java.util.List;

public class Generic<T>{

    public void swapArrayElements(int numberFirst, int numberSecond, T[] arr) {
        T storage = arr[numberFirst];
        arr[numberFirst] = arr[numberSecond];
        arr[numberSecond] = storage;

    }

    public void transformArray(T[] arr, List<T> arrayList) {
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);

        }
    }
}
