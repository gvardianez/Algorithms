package lesson_2_sort;


import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public static void main(String[] args) {
        int[] bubbleArr, bubbleOptimizeArr, selectArr, insertArr;
        Random random = new Random();
        int[] ints = new int[100000];
        ints = Arrays.stream(ints).map((s) -> random.nextInt(100)).toArray();
        long time = System.currentTimeMillis();
        bubbleArr = bubbleSort(ints);
        System.out.println("Bubble sort: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        bubbleOptimizeArr = bubbleSortOptimize(ints);
        System.out.println("Bubble Optimize sort: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        selectArr = selectSort(ints);
        System.out.println("Select sort: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        insertArr = insertSort(ints);
        System.out.println("Insert sort: " + (System.currentTimeMillis() - time));
        System.out.println(Arrays.equals(bubbleArr, bubbleOptimizeArr) + " " + Arrays.equals(bubbleArr, insertArr) + " " + Arrays.equals(selectArr, insertArr));
    }

    private static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public static int[] bubbleSort(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arrayCopy.length; i++) {
            for (int j = 0; j < arrayCopy.length - i; j++) {
                if (arrayCopy[j + 1] < arrayCopy[j]) {
                    swap(arrayCopy, j, j + 1);
                }
            }
        }
        return arrayCopy;
    }

    public static int[] bubbleSortOptimize(int[] array) {
        boolean flag;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arrayCopy.length; i++) {
            flag = false;
            for (int j = 0; j < arrayCopy.length - i; j++) {
                if (arrayCopy[j + 1] < arrayCopy[j]) {
                    swap(arrayCopy, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return arrayCopy;
    }

    public static int[] selectSort(int[] array) {
        int tempMinIndex;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            tempMinIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (arrayCopy[j + 1] < arrayCopy[tempMinIndex]) {
                    tempMinIndex = j + 1;
                }
            }
            swap(arrayCopy, i, tempMinIndex);
        }
        return arrayCopy;
    }

    public static int[] insertSort(int[] array) {
        int j;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arrayCopy.length; i++) {
            int cursor = arrayCopy[i];
            j = i;
            while (j > 0 && arrayCopy[j - 1] > cursor) {
                arrayCopy[j] = arrayCopy[j - 1];
                j--;
            }
            arrayCopy[j] = cursor;
        }
        return arrayCopy;
    }

    public static int[] selectSortMinMax(int[] array) {
        int tempMin;
        int tempMax;
        int tempMinIndex = 0;
        int tempMaxIndex = 0;
        boolean flagMin, flagMax;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < (array.length / 2); i++) {
            flagMin = false;
            flagMax = false;
            tempMax = arrayCopy[i];
            tempMin = arrayCopy[i];
            for (int j = i; j < array.length - i - 1; j++) {
                if (arrayCopy[j + 1] < tempMin) {
                    tempMinIndex = j + 1;
                    tempMin = arrayCopy[j + 1];
                    flagMin = true;
                } else if (arrayCopy[j + 1] > tempMax) {
                    tempMaxIndex = j + 1;
                    tempMax = arrayCopy[j + 1];
                    flagMax = true;
                }
            }
            if (flagMax) swap(arrayCopy, arrayCopy.length - i - 1, tempMaxIndex);
            if (flagMin) swap(arrayCopy, i, tempMinIndex);
        }
        return arrayCopy;
    }

}

//Консоль
//Bubble sort: 17818
//Bubble Optimize sort: 17737
//Select sort: 7303
//Insert sort: 936
//true true true