public class Node {
    public Node[] children;
    public boolean isEndOfWord;
    public Node() {
        children = new Node[255];
        isEndOfWord = false;
    }
}