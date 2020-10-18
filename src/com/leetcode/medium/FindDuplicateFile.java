package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode #609
public class FindDuplicateFile {

	public static void main(String[] args) {
		String[] inputs = new String[4];
		inputs[0] = "root/a 1.txt(abcd) 2.txt(efgh)";
		inputs[1] = "root/c 3.txt(abcd)";
		inputs[2] = "root/c/d 4.txt(efgh)";
		inputs[3] = "root 4.txt(efgh)";
		FindDuplicateFile file = new FindDuplicateFile();
		System.out.println(file.findDuplicate(inputs));
	}
	//["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
	public List<List<String>> findDuplicate(String[] paths) {

		Map<String, List<String>> contentMap = new HashMap<String, List<String>>();
		
		for (int i = 0; i < paths.length; i++) {
			String[] pathString = paths[i].split(" ");
			
			for (int j = 1; j < pathString.length; j++) {
				String content = getContent(pathString[j]);
				if (contentMap.containsKey(content)) {
					List<String> listExist = contentMap.get(content);
					listExist.add(pathString[0] + "/" + getFileName(pathString[j]));
					contentMap.put(content, listExist);
				} else {
					List<String> list = new ArrayList<String>();
					list.add(pathString[0] + "/" + getFileName(pathString[j]));
					contentMap.put(content, list);
				}
			}				
		}
				
		List<List<String>> result = new ArrayList<List<String>>();
	    for (Map.Entry<String, List<String>> entry : contentMap.entrySet()) {
	    	if (entry.getValue().size() > 1) {
	    		result.add(entry.getValue());
	    	}	    	
	    }
		
		return result;
	}
	
	public String getContent(String s) {
		int startIndex = s.indexOf('(');
		return s.substring(startIndex + 1, s.length());
	}
	
	public String getFileName(String s) {
		int endIndex = s.indexOf('(');
		return s.substring(0, endIndex);
	}

}
