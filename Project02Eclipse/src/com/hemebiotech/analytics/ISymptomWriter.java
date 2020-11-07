package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomWriter {

	List<String> PutSymptoms(TreeMap<String, Integer> treeMap) throws Exception;
}
