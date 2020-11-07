package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// Initialization of list'symptoms
		ReadSymptomDataFromFile listSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> result = listSymptoms.GetSymptoms();

		// Initialization of TreeMap to link symptom to his count
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		Set<String> keys = map.keySet();

		// Initialization of the file for result
		FileWriter writer = new FileWriter("result.out.txt");

		int countSymptom = 0;

		// Loop to read symptom and add him and his count in the TreeMap
		for (String symptom : result) {
			countSymptom = 0;
			for (String symptom1 : result) {
				if (symptom1.equals(symptom)) {
					countSymptom++;
				}
			}
			map.put(symptom, countSymptom);
		}

		// Loop to write in file result
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
			writer.write(key + ": " + map.get(key) + "\n");
		}
		writer.close();
	}
}
