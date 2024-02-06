public class BinarySearchST<Key extends Comparable, Value> implements SymbolTable<Key, Value> {
    private Key[] keys;
    private Value[] values;
    private int size;

    public BinarySearchST(int capacity) {
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
    }

    private int rank(Key key) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int compare = key.compareTo(keys[mid]);
            if (compare < 0) {
                high = mid - 1;
            } else if (compare > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    /**
     * Put a key-value pair into the table
     *
     * @param key
     * @param val
     */
    @Override
    public void put(Key key, Value val) {

    }

    /**
     * Returns the value paired with the given key.
     *
     * @param key
     */
    @Override
    public Value get(Key key) {
        return null;
    }

    /**
     * Remove key (and it's value) from the table.
     *
     * @param key
     */
    @Override
    public void delete(Key key) {
        SymbolTable.super.delete(key);
    }

    /**
     * Returns true if there is a value paired with a key.
     *
     * @param key
     */
    @Override
    public boolean contains(Key key) {
        return SymbolTable.super.contains(key);
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
        return 0;
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
