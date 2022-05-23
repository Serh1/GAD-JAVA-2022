package Lecture6_Collections.Ch7;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K,V> implements MyHashTable<K,V> {
    List<K> keys;
    List<V> values;
    HashTable(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {
        HashTable myhashtable = new HashTable();

    }
}
