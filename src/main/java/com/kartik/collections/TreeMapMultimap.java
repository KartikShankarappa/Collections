package com.kartik.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMultimap<K, V> implements Multimap<K, V> {
	
	private final TreeMap<K, Collection<V>> treeMap;
	
	public TreeMapMultimap() {
		this.treeMap = new TreeMap<>();
	}
	
	@Override
	public boolean putItem(K key, V value) {
		
		Collection<V> collection = treeMap.get(key);
		/**
		 * Checks if there exists a list. If not, then it will create a new list (in this case
		 * a Array list and will put the value in the list)
		 */
		if (collection == null) {
			collection = new ArrayList<>();
			treeMap.put(key, collection);
		}
		
		return collection.add(value);
	}

	@Override
	public void clear() {
		treeMap.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return treeMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return treeMap.containsValue(value);
	}
	
	@Override
	public Set<Entry<K, Collection<V>>> entrySet() {
		return treeMap.entrySet();
	}

	@Override
	public Collection<V> get(Object key) {
		return treeMap.get(key);
	}

	@Override
	public boolean isEmpty() {
		return treeMap.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return treeMap.keySet();
	}

	@Override
	public Collection<V> put(K key, Collection<V> value) {
		return treeMap.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends Collection<V>> c) {
		treeMap.putAll(c);
	}

	@Override
	public Collection<V> remove(Object key) {
		return treeMap.remove(key);
	}

	@Override
	public int size() {
		return treeMap.size();
	}

	@Override
	public Collection<Collection<V>> values() {
		return treeMap.values();
	}

	@Override
	public Collection<V> getItems(K key) {
		return treeMap.get(key);
	}
	
	@Override
	public boolean equals(Object o) {
		return treeMap.equals(o);
	}
	
	@Override
	public int hashCode() {
		return treeMap.hashCode();
	}
	
	@Override
	public String toString() {
		return treeMap.toString();
	}

}
