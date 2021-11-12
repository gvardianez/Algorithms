package lesson_3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] array;
    private int size;
    private final int DEFAULT_CAPACITY = 100;
    private int head;
    private int tail;

    public MyDeque() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T[] getArray() {
        return array;
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
            //
        }
        size++;
        array[tail] = item;
        tail = nextIndex(tail);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
            //
        }
        size++;
        head = prevIndex(head);
        System.out.println(head);
        array[head] = item;
    }

    public T removeLeft() {
        T temp = peekLeft();
        array[head] = null;
        head = nextIndex(head);
        size--;
        return temp;
    }
    public T removeRight() {
        T temp = peekLeft();
        array[tail] = null;
        tail = nextIndex(tail);
        size--;
        return temp;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return array[head];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return array[tail];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    private int nextIndex(int index) {
        return (index + 1) % array.length;
    }

    private int prevIndex(int index) {
        if (index == 0) return array.length - 1;
        return (index - 1);
    }

//    private void checkSize() {
//        if (size + 1 == array.length) {
//            T[] arrayPartOne = Arrays.copyOf(array, (int) (array.length*1.75));
//            T[] arrayPartTwo = (T[]) new Object[array.length - tail];
//            System.arraycopy(arrayPartOne, tail, arrayPartTwo, 0, array.length - tail);
//
//        }
//    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = head, j = 0; j < size; i = nextIndex(i), j++) {
            sb.append(array[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }


}
