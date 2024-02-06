public class SequentialSearchST<Key, Value> implements SymbolTable<Key, Value>{
    private Node head;
    private int size;
    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public SequentialSearchST(){
        head = null;
        size = 0;
    }

    /**
     * Put a key-value pair into the table
     *
     * @param key
     * @param val
     */
    @Override
    public void put(Key key, Value val) {
        Node current = head;
        while(current!=null){
            if (key.equals(current.key)){
                current.value = val;
                return;
            }
            current=current.next;
        }
        Node newNode = new Node(key, val, head.next);
        head.next=newNode;
    }

    /**
     * Returns the value paired with the given key.
     *
     * @param key
     */
    @Override
    public Value get(Key key) {
        Node current = head;
        while(current!=null){
            if(key.equals(current.key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * Remove key (and it's value) from the table.
     *
     * @param key
     */
    @Override
    public void delete(Key key) {
        Node current = head.next;
        Node previous = head;
        while(current!=null){
            if(key.equals(current.key)){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    /**
     * Returns true if there is a value paired with a key.
     *
     * @param key
     */
    @Override
    public boolean contains(Key key) {
        Node current = head;
        while(current!=null) {
            if (current.key.equals(key)) return true;
            current=current.next;
        }
        return false;
    }

    /**
     * Returns true if the table is empty.
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return SymbolTable.super.isEmpty();
    }

    /**
     * Returns the number of key-value pairs in the table.
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns an iterator that refers to all the keys
     * in the table.
     */
    @Override
    public Iterable<Key> keys() {
        return null;
    }
}
