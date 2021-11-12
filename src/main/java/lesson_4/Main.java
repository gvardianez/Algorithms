package lesson_4;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//        myLinkedList.insertLast(1);
//        myLinkedList.insertLast(2);
//        myLinkedList.insertLast(3);
//        myLinkedList.insertLast(4);
//        myLinkedList.insertLast(5);
//        System.out.println(myLinkedList);
//        ListIterator<Integer> listIterator = myLinkedList.listIterator();
//        listIterator.add(10);
//        System.out.println(myLinkedList);
//        listIterator.set(3);
//        listIterator.add(100);
//        listIterator.set(2);
//        System.out.println(myLinkedList);
//        listIterator.add(8);
//        System.out.println(myLinkedList);
//        listIterator.remove();
//        System.out.println(myLinkedList.indexOf(4));
//        listIterator.set(1);
//        System.out.println(myLinkedList);
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//        for (Integer integer : myLinkedList) {
//            System.out.println(integer);
//        }
        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();
        myLinkedStack.push(1);
        myLinkedStack.push(2);
        myLinkedStack.push(3);
        myLinkedStack.push(4);
        myLinkedStack.push(5);
        System.out.println(myLinkedStack);
    }
}
