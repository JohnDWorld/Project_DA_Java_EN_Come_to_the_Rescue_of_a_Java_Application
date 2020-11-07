package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// Instantiation of list'symptoms
		ReadSymptomDataFromFile listSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> result = listSymptoms.GetSymptoms();

		// Instantiation of the file for result
		FileWriter writer = new FileWriter("result.out.txt");

		// Instantiation of counter of symptom
		CountSymptom countSymptom = new CountSymptom();
		TreeMap<String, Integer> listSymptomCheck = countSymptom.CounterMapSymptom(result);
		Set<String> keys = listSymptomCheck.keySet();

		// Loop to write in file result
		for (String key : keys) {
			System.out.println(key + ": " + listSymptomCheck.get(key));
			writer.write(key + ": " + listSymptomCheck.get(key) + "\n");
		}
		writer.close();
	}
}
