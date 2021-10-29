package lesson_3.ObjectQueue;

class ObjectBox{

    private Object object;
    private ObjectBox next;
    private ObjectBox prev;
    private int priority;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectBox getNext() {
        return next;
    }

    public void setNext(ObjectBox next) {
        this.next = next;
    }
    public ObjectBox getPrev() {
        return prev;
    }

    public void setPrev(ObjectBox prev) {
        this.prev = prev;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {

        return priority;
    }
}