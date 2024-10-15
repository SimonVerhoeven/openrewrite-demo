package dev.simonverhoeven.openrewritedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public int mostWordsFound(String[] s) {
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<s.length;i++);
		{
			String[] arr = s[i].split(" ");
			al.add(arr.length);
		}
		Collections.sort(al);
		Collections.reverse(al);
		return al.get(0);
	}
} 