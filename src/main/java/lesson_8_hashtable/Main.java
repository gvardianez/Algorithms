package lesson_8_hashtable;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer,Integer> chainingHashMap = new ChainingHashMap<>(10);
        chainingHashMap.put(1,1);
        chainingHashMap.put(3,3);
        chainingHashMap.put(5,5);
        chainingHashMap.put(10,10);
        chainingHashMap.put(17,17);
        chainingHashMap.put(11,25);
        chainingHashMap.put(17,17);
        System.out.println(chainingHashMap);
        System.out.println(chainingHashMap.get(1));
        System.out.println(chainingHashMap.remove(11));
        chainingHashMap.put(17,555);
        System.out.println(chainingHashMap);
        LinearProbingHashMap<Integer,Integer> linearProbingHashMap = new LinearProbingHashMap<>(10);
        linearProbingHashMap.put(1,1);
        linearProbingHashMap.put(2,2);
        System.out.println(linearProbingHashMap);
        linearProbingHashMap.remove(1);
        linearProbingHashMap.put(1,1);
        linearProbingHashMap.put(3,3);
        linearProbingHashMap.remove(3);
        linearProbingHashMap.put(4,4);
        linearProbingHashMap.put(5,5);
        System.out.println(linearProbingHashMap.remove(4));
        linearProbingHashMap.put(6,6);
        linearProbingHashMap.put(7,7);
        linearProbingHashMap.put(11,11);
        System.out.println(linearProbingHashMap.get(4));
        System.out.println(linearProbingHashMap.get(7));
        System.out.println(linearProbingHashMap.get(5));
        System.out.println(linearProbingHashMap.get(6));
        System.out.println(linearProbingHashMap.get(7));
        linearProbingHashMap.put(1,1);
        linearProbingHashMap.put(4,4);
        System.out.println(linearProbingHashMap);
        System.out.println(linearProbingHashMap.get(4));
    }

}
