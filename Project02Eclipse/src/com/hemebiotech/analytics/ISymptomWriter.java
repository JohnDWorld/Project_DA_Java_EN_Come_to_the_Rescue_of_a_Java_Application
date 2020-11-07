package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will write symptom data in a source. The important part is, the
 * return value from the operation, which is a list of strings, that may contain
 * many duplications
 *
 * The implementation does not need to order the list
 *
 * @author JohnDWorld
 */
public interface ISymptomWriter {

	/**
	 * If no data is available, return an empty List
	 *
	 * @return a raw listing of summary of symptoms obtained from a data source,
	 * @throws Exception
	 */
	List<String> PutSymptoms(TreeMap<String, Integer> treeMap) throws Exception;
}
