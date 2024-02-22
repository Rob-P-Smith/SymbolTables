//public class RedBlackBST<Key extends Comparable<Key>, Value> implements SymbolTable<Key, Value> {
//
//    private static final boolean RED= true;
//    private static final boolean BLACK = false;
//
//    private class Node {
//
//        Key key;
//        Value value;
//        Node left;
//        Node right;
//        int nodesInSubtree;
//        boolean color; // color of the link from the parent node to this node
//
//        public Node(Key key, Value value))
//
//        {
//            this.key = key;
//            this.value = value;
//            left = null;
//            right = null;
//            boolean color = RED;
//        }
//    }
//
//    private boolean isRed(Node current){
//        return false;
//    }
//
//    private Node rotateLeft(Node current){
//        return null;
//    }
//
//    private Node rotateRight(Node current){
//        return null;
//    }
//
//    private void flipColors(Node current){
//
//    }
//    /**
//     * Put a key-value pair into the table
//     *
//     * @param key
//     * @param val
//     */
//    @Override
//    public void put(Key key, Value val) {
//        root = put(root, key, val);
//    }
//
//    private Node put(Node current, Key key, Value value){
//        if (current == null) {
//            BST.Node theNewNode = new BST.Node(key, val);
//            theNewNode.nodesInSubtree = 1;
//            return theNewNode;
//        }
//
//        int cmp = key.compareTo(current.key);
//        if (cmp < 0) {
//            current.left = put(current.left, key, val);
//        } else if (cmp > 0) {
//            current.right = put(current.right, key, val);
//        } else {
//            current.value = val;
//        }
//
//        current.nodesInSubtree = size(current.left) + size(current.right) + 1;
//        return current;
//    }
//    /**
//     * Returns the value paired with the given key.
//     *
//     * @param key
//     */
//    @Override
//    public Value get(Key key) {
//        return null;
//    }
//
//    /**
//     * Remove key (and it's value) from the table.
//     *
//     * @param key
//     */
//    @Override
//    public void delete(Key key) {
//        SymbolTable.super.delete(key);
//    }
//
//    /**
//     * Returns true if there is a value paired with a key.
//     *
//     * @param key
//     */
//    @Override
//    public boolean contains(Key key) {
//        return SymbolTable.super.contains(key);
//    }
//
//    /**
//     * Returns true if the table is empty.
//     *
//     * @return
//     */
//    @Override
//    public boolean isEmpty() {
//        return SymbolTable.super.isEmpty();
//    }
//
//    /**
//     * Returns the number of key-value pairs in the table.
//     *
//     * @return
//     */
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    /**
//     * Returns an iterator that refers to all the keys
//     * in the table.
//     */
//    @Override
//    public Iterable<Key> keys() {
//        return null;
//    }
//}
