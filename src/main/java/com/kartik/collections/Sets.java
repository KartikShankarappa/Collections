package com.kartik.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {


    public static <T> Set<T> union(Set<T> left, Set<T> right) {
	// TODO
    	
    	if (left == null) {
    		return right;
    	}
    	
    	if (right == null) {
    		return left;
    	}
   
    	int size = left.size() + right.size();
       	Set<T> unionOfSet = new HashSet<T>(size);    	
       	unionOfSet.addAll(left);
       	unionOfSet.addAll(right);
       	return unionOfSet;
        	
    }


    public static <T> Set<T> intersection(Set<T> left, Set<T> right) {
	// TODO
    	
    	if (left == null) {
    		return right;
    	}
    	
    	if (right == null) {
    		return left;
    	}
    	
    	int size = left.size() + right.size();
       	Set<T> intersectionOfSet = new HashSet<T>(size);  
       	intersectionOfSet.addAll(left);
       	intersectionOfSet.retainAll(right);
       	return intersectionOfSet;
    	
    }

    public static <T> Set<T> symmetricDifference(Set<T> left, Set<T> right) {
	// TODO
    	
    	if (left == null) {
    		return right;
    	}
    	
    	if (right == null) {
    		return left;
    	}
   
    	int size = left.size() + right.size();
       	Set<T> symmetricDifferenceOfSet = new HashSet<T>(size);  
       	
       	Set<T> unionOfSet = union(left, right);
       	Set<T> intersectionOfSet = intersection(left, right);
       	
       	symmetricDifferenceOfSet.addAll(unionOfSet);
       	symmetricDifferenceOfSet.removeAll(intersectionOfSet);

       	return symmetricDifferenceOfSet;
    		
    }

    public static <T> List<Set<T>> cartesianProduct(List<Set<T>> sets) {
	// TODO
    	
    	List<Set<T>> listOfSets = new ArrayList<Set<T>>();
    	
    	if (sets == null) {
    		throw new NullPointerException("Null value passed for the list of sets \n");
    	}
    	
    	if (sets.size() == 0) {
    		listOfSets.add(new HashSet<T>());
    		return listOfSets;
    	}
    	else {
    		Set<T> initialSet = sets.get(0);
    		List<Set<T>> remainingSets = cartesianProduct(sets.subList(1, sets.size()));
    		for (T set: initialSet) {
    			for (Set<T> remainingSet : remainingSets) {
                    HashSet<T> newSet = new HashSet<T>();
                    newSet.add(set);
                    newSet.addAll(remainingSet);
                    listOfSets.add(newSet);
                }
    		}
    	}
    	return listOfSets;
    }

}
