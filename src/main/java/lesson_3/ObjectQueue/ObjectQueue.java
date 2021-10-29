package lesson_3.ObjectQueue;

class ObjectQueue {
    private ObjectBox head;
    private ObjectBox tail;
    private int size;

    public void pushWithPr(Object obj, int pr) {
        ObjectBox ob = new ObjectBox();
        ob.setPriority(pr);
        ob.setObject(obj);
        if (head == null) {
            head = ob;
            tail = ob;
        } else {
            int currentPrTail = tail.getPriority();
            int currentPrHead = head.getPriority();
            if (pr <= currentPrTail) {
                ob.setPrev(tail);
                tail.setNext(ob);
                tail = ob;
            }  else if (pr > currentPrHead) {
                ob.setNext(head);
                head.setPrev(ob);
                head = ob;
            }  else  {
                ObjectBox currentHead;
                ObjectBox currentTail;
                currentHead = head;
                currentTail = head.getNext();
                int prTail;
                prTail = currentTail.getPriority();
                while (pr <= prTail ){
                    currentHead = currentTail;
                    currentTail = currentHead.getNext();
                    prTail = currentTail.getPriority();
                }
                ob.setPrev(currentHead);
                ob.setNext(currentTail);
                currentHead.setNext(ob);
                currentTail.setPrev(ob);
            }
        }
        size++;

    }

    public void push(Object obj, int pr) {
        ObjectBox ob = new ObjectBox();
        ob.setPriority(pr);
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setNext(ob);
            ob.setPrev(tail);
        }
        tail = ob;
        size++;
    }

    public Object pullHead() {
        if (size == 0) {
            return null;
        }
        Object obj = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return obj;
    }


    public Object pullTail() {
        if (size == 0)
            return null;
        Object obj = tail.getObject();
            tail = tail.getPrev();
                if (tail == null) {
                head = null;
        }
        size--;
        return obj;
    }

    public Object get(int index) {
        if (size == 0 || index >= size || index <= 0) {
            return null;
        }
        ObjectBox current = head;
        int pos = 1;
        while (pos < index) {
            current = current.getNext();
            pos++;
        }
        Object obj = current.getObject();
        return obj;
    }

    public int size() {
        return size;
    }


}
