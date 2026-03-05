//use ddl and map
//head/start of ddl - most recent used/ latest data - insertion will done at start
//tail/ end of ddl - least recent used/ oldest data - deletion will done at end
//to delete the null pointer cases we will use dummy node head and tail so that it will ensure us that no node has null val 
//whenever we need to get the key val pair in O(1) we need to use map

import java.util.HashMap;
import java.util.Map;

class Node{
    int key, val;
    Node prev, next;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = this.next = null;
    }
}
public class LRUCache {
    private int cap;
    private Map<Integer, Node> cache;
    private Node head, tail; //head - MRU , tail - LRU

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0); // dummy head
        this.tail = new Node(0,0); // dummy tail
        head.next = tail;
        tail.prev = head;
    }
    public void addNode(Node newNode){
       Node oldNext = head.next;
       head.next = newNode;
       oldNext.prev = newNode;
       newNode.next = oldNext;
       newNode.prev = head;
    }
    public void remove(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;

        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;

    }
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        remove(node);
        addNode(node);
        return node.val;
        
    }
    
    // it will get added at the start of the DDL
    public void put(int key, int value) {
        //if key already exist
        if(cache.containsKey(key)){
            Node oldNode = cache.get(key);
            remove(oldNode);
            cache.remove(key);
        }

        //if cache is full
        if(cache.size() == cap){
            Node lru = tail.prev; // least recently used
            cache.remove(lru.key);
            remove(lru);
        }
        //Insert new node
        Node newNode = new Node(key, value);
        addNode(newNode);
        cache.put(key, newNode);
    }
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1)); // returns 1
        lru.put(3, 3); // evicts key 2
        System.out.println(lru.get(2)); // returns -1 (not found)
        lru.put(4, 4); // evicts key 3
        System.out.println(lru.get(3)); // returns -1 (not found)
        System.out.println(lru.get(4)); // returns 4
    }
    
}
