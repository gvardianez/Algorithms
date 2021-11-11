package lesson_6_trees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<MyTree<Integer, Integer>> myTreeList = createTrees(100000, 6);
        myTreeList = myTreeList.stream().filter(MyTree::isBalanced).collect(Collectors.toList());
        System.out.println("Процент сбалансированныx деревьев: " + (double) myTreeList.size() / 1000 + "%");
    }

    public static List<MyTree<Integer, Integer>> createTrees(int number, int level) {
        List<MyTree<Integer, Integer>> treeList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            MyTree<Integer, Integer> myTree = new MyTree<>();
            while (true) {
                int key = (int) (100 - (Math.random() * 200));
                myTree.put(key, key);
                if (myTree.height() == level) {
                    myTree.delete(key);
                    break;
                }
            }
            treeList.add(myTree);
        }
        return treeList;
    }

}
