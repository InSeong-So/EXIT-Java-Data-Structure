package searchAlgorithm.trieSearch;

import java.util.HashMap;
import java.util.Map;

public class TrieNode2 {
    private Map<Character, TrieNode2> children = new HashMap<>();
    private boolean endOfWord;
    private Integer contentKey;

    public Map<Character, TrieNode2> getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord();
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public Integer getContentKey() {
        return contentKey;
    }

    public void setContentKey(Integer contentKey) {
        this.contentKey = contentKey;
    }
}
