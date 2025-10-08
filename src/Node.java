public class Node {
    public Node[] children;
    public boolean isEndOfWord;
    public Node() {
        // 255 Children for 255 Ascii values
        children = new Node[255];
        isEndOfWord = false;
    }
}
