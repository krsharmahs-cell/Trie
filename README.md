# Trie Implementation in Java

A standard, clean Java implementation of a **Trie (Prefix Tree)** data structure under the `Trie` package, focused on efficient string insertion.

## Project Structure

The codebase is structured under the `Trie` package and contains three foundational components:
* **`TrieNode`**: The architectural unit of the prefix tree.
* **`Trie`**: The structure container defining the root initialization and insertion algorithm.
* **`Trie1`**: The executable driver script housing the application entry point (`main` method).

## How It Works

### 1. Data Structures
* **`children`**: An internal array of size 26 tracking downstream alphabetical paths.
* **`isEndOfWord`**: A boolean flag marking the terminal character of a fully complete word.

### 2. Core Insert Implementation
The algorithm processes the character array of a word sequentially. It builds explicit nodes for any missing character indexes mapped dynamically via lowercase ASCII offset calculation (`c - 'a'`).

```java
package Trie;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
}
```

## Running the Application

### 1. Compilation
Navigate to your main workspace root folder in your terminal and compile the file layout:
```bash
javac Trie/Trie1.java
```

### 2. Execution
Run the compiled bytecode using the fully qualified package path:
```bash
java Trie.Trie1
```

### 3. Sample Execution Output
```text
Insertion is sucessfully done
```
