package lesson_4;

public class MyLinkedStack<T> {

    private final MyLinkedList<T> list;

    public MyLinkedStack() {
        this.list = new MyLinkedList<>();
    }

    public void push(T item){
        list.insertFirst(item);
    }

    public T pop(){
        return list.deleteFirst();
    }

    public T peek(){
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
