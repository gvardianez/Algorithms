package lesson_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("qwerty"));
        MyDeque<Integer> integerMyDeque = new MyDeque<>();
        integerMyDeque.insertLeft(1);
        integerMyDeque.insertLeft(7);
        integerMyDeque.insertRight(5);
        integerMyDeque.insertRight(10);
        integerMyDeque.insertRight(15);
        integerMyDeque.insertRight(20);
        integerMyDeque.insertRight(25);
        System.out.println(Arrays.toString(integerMyDeque.getArray()));
//        integerMyDeque.insertLeft(3);
//        integerMyDeque.insertLeft(1);
        System.out.println(integerMyDeque);
        System.out.println(integerMyDeque.removeLeft());
        System.out.println(integerMyDeque);
//        System.out.println(integerMyDeque);
//        System.out.println(integerMyDeque.peekRight());
    }
}
