package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 * @author JohnDWorld
 */
public class WriteSymptomDataInFile implements ISymptomWriter {

	private String filepath;

	/**
	 *
	 * @param filepath a full or partial path to file where you want to write
	 *                 symptom strings and his count integer, one per line.
	 */
	public WriteSymptomDataInFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> PutSymptoms(TreeMap<String, Integer> treeMap) throws Exception {

		FileWriter writer = new FileWriter(filepath);

		Set<String> keys = treeMap.keySet();

		for (String key : keys) {
			System.out.println(key + ": " + treeMap.get(key));
			writer.write(key + ": " + treeMap.get(key) + "\n");
		}

		writer.close();
		return null;
	}
}