package com.qa.HelloWorldGit;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	private Map<Integer, Tournament> myMap = new HashMap<>();
	private static int objCount = 0;

	public Map<Integer, Tournament> getMyMap() {
		return myMap;
	}

	public void addObject(Tournament obj) {
		objCount++;
		this.myMap.put(objCount, obj);
	}	
	
	public Tournament getTournamentById(int id) {
		
		return myMap.get(id);
		
	}
	
}


