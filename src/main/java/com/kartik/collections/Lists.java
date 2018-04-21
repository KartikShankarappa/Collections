package com.kartik.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static <T> List<List<T>> segment(List<T> list, int size) {
	// TODO
    	
    	if (list == null) {
    		throw new NullPointerException("Null value passed for the list \n");
    	}
    	
    	if (size < 1) {
    		throw new IllegalArgumentException("The value of size should be greator than 0 \n");
    	}
    	
    	List<List<T>> listOfLists = new ArrayList<List<T>>();
    	
    	if (list.size() == 0) {
    		listOfLists.add(new ArrayList<T>());
    		return listOfLists;
    	}
    	else {
    	    for (int start = 0; start < list.size(); start += size) {
    	        int end = Math.min(start + size, list.size());
    	        List<T> sublist = list.subList(start, end);
    	        listOfLists.add(sublist);
    	        
    	    }
    	}
    	
    	return listOfLists;	
    	
    }

}
