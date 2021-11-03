package lesson_5;

import java.util.*;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(recExponent(2, 5));
        List<Item> items = new ArrayList<>(List.of(new Item("book",1000,3),new Item("calculator",1500,1),new Item("pencil",2500,3),new Item("pencil1",2500,4)));
        List<Item> bestSet = new Backpack(8).getBestSetItems(items);
        System.out.println(bestSet);
    }

    public static int recExponent(int a, int b) {
        if (b == 1) {
            return a;
        }
        return (recExponent(a, b - 1)) * a;
    }

}
