package searchAlgorithm.trieSearch;

public class Trie2 {
    private TrieNode2 root;

    public Trie2() {
        root = new TrieNode2();
    }

    public void insert(String keyword, Integer seed) {
        TrieNode2 current = root;

        for (int i = 0; i < keyword.length(); i++) {
            current = current.getChildren().computeIfAbsent(keyword.charAt(i), c -> new TrieNode2());
        }
        current.setEndOfWord(true);
        current.setContentKey(seed);
    }

    public boolean delete(String keyword) {
        return delete(root, keyword, 0);
    }

    public boolean containsNode(String query) {
        TrieNode2 current = root;

        for (int i = 0; i < query.length(); i++) {
            char ch = query.charAt(i);
            TrieNode2 node = current.getChildren().get(ch);
            if (node == null) {
                return false;
            }
            current = root;
        }
        return current.isEndOfWord();
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean delete(TrieNode2 current, String query, int index) {
        if (index == query.length()) {
            if (!current.isEndOfWord()) {
                return false;
            }
            current.setEndOfWord(false);
            return current.getChildren().isEmpty();
        }
        char ch = query.charAt(index);
        TrieNode2 node = current.getChildren().get(ch);
        if (node == null) {
            return false;
        }

        boolean shouldDeleteCurrentNode = delete(node, query, index + 1) && !node.isEndOfWord();

        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty();
        }

        return false;
    }
}
