package lesson_8_hashtable;

import java.util.LinkedList;

public class ChainingHashMap<K, V> {
    private int capacity;
    private int size;
    private LinkedList<Node>[] innerArrayOfLists;

    public ChainingHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        innerArrayOfLists = new LinkedList[capacity];
        for (int i = 0; i < innerArrayOfLists.length; i++) {
            innerArrayOfLists[i] = new LinkedList<>();
        }
    }

    private class Node {
        final int hash;
        final K key;
        V value;

        public Node(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int index(int hash) {
        return (hash & 0x7fffffff) % capacity;
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public void checkKeyNotNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
    }

    public void put(K key, V value) {
        Node node = findNode(key);
        int hash = key.hashCode();
        if (node == null) {
            Node newNode = new Node(key, value, hash);
            innerArrayOfLists[index(hash)].addLast(newNode);
            size++;
        } else node.value = value;
    }

    private Node findNode(K key) {
        checkKeyNotNull(key);
        int hash = key.hashCode();
        int i = index(hash);
        for (Node node : innerArrayOfLists[i]) {
            if (hash == node.hash) {
                if (key.equals(node.key)) {
                    return node;
                }
            }
        }
        return null;
    }

    public V get(K key) {
        Node node = findNode(key);
        if (node == null) return null;
        return node.value;
    }

    public V remove(K key) {
        Node node = findNode(key);
        if (node == null) return null;
        innerArrayOfLists[index(node.hash)].remove(node);
        size--;
        return node.value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            sb.append(i).append(" -> ");
            for (Node node : innerArrayOfLists[i]) {
                sb.append(node.key).append(" = ").append(node.value).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
