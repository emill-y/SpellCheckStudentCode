public class Trie {
    private Node root;

    // Initialize Constructor
    public Trie() {
        root = new Node();
    }

    // Insert word into Trie
    public void insert(String word) {
        Node current = root;
        // Add each character to node map.
        for (char c : word.toCharArray()) {
            if (current.children[c] == null) {
                current.children[c] = new Node();
            }
            current = current.children[c];
        }
        current.isEndOfWord = true;
    }

    // Check if Trie contains word
    public boolean contains(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            if (current.children[c] == null) {
                return false;
            }
            current = current.children[c];
        }
        return current.isEndOfWord;
    }
}
