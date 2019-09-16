package code401challenges.hashtable;

public class Node {

    public String key;
    public String value;
    public Node next;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node(String key, String value){
        setKey(key);
        setKey(value);
    }
}
