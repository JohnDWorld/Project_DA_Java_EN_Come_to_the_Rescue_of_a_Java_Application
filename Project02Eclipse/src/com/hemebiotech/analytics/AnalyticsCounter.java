package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Analysis and count symptom, contain the main method
 *
 * @author JohnDWorld
 * @version 1.0
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile listSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> result = listSymptoms.GetSymptoms();
		CountSymptom countSymptom = new CountSymptom();
		TreeMap<String, Integer> listSymptomCheck = countSymptom.CounterMapSymptom(result);
		WriteSymptomDataInFile file = new WriteSymptomDataInFile("result.out.txt");
		file.PutSymptoms(listSymptomCheck);
	}
}
