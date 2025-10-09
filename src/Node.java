public class Node {
    public Node[] children;
    public boolean isEndOfWord;
    public Node() {
        // 256 Children for 256 Ascii values
        children = new Node[256];
        isEndOfWord = false;
    }
}
