
package Trie;

class TrieNode{
    TrieNode []children = new TrieNode[26];
    boolean isEndOfWord =false;
}

class Trie {
    private TrieNode root;
    // Constructor
    public Trie() {
        root = new TrieNode();
    }
    
    // Insert function
    public void insert(String word)
    {
        TrieNode current =root;
        for(char c : word.toCharArray())
        {
            int index= c - 'a';
            if(current.children[index]== null)
            {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }

        current.isEndOfWord = true;


    }
}

public class Trie1 {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("dog");
        trie.insert("cat");

        System.out.println("Insertion is sucessfully done");
        
    }
}