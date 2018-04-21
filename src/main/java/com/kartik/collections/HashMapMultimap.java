package com.kartik.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashMapMultimap<K, V> implements Multimap<K, V>{

	private final HashMap<K, Collection<V>> hashMap;
	
	public HashMapMultimap() {
		this.hashMap = new HashMap<>();
	}
	
	@Override
	public boolean putItem(K key, V value) {
		
		Collection<V> collection = hashMap.get(key);
		/**
		 * Checks if there exists a list. If not, then it will create a new list (in this case
		 * a linked list and will put the value in the list)
		 */
		if (collection == null) {
			collection = new LinkedList<>();
			hashMap.put(key, collection);
		}
		
		return collection.add(value);
	}
	
	@Override
	public void clear() {
		hashMap.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return hashMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return hashMap.containsValue(value);
	}

	@Override
	public Set<Entry<K, Collection<V>>> entrySet() {
		return hashMap.entrySet();
	}

	@Override
	public Collection<V> get(Object key) {
		return hashMap.get(key);
	}

	@Override
	public boolean isEmpty() {
		return hashMap.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return hashMap.keySet();
	}

	@Override
	public Collection<V> put(K key, Collection<V> value) {
		return hashMap.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends Collection<V>> c) {
		hashMap.putAll(c);
	}

	@Override
	public Collection<V> remove(Object key) {
		return hashMap.remove(key);
	}

	@Override
	public int size() {
		return hashMap.size();
	}

	@Override
	public Collection<Collection<V>> values() {
		return hashMap.values();
	}

	@Override
	public Collection<V> getItems(K key) {
		return hashMap.get(key);
	}

	@Override
	public boolean equals(Object o) {
		return hashMap.equals(o);
	}
	
	@Override
	public int hashCode() {
		return hashMap.hashCode();
	}
	
	@Override
	public String toString() {
		return hashMap.toString();
	}
	
}
