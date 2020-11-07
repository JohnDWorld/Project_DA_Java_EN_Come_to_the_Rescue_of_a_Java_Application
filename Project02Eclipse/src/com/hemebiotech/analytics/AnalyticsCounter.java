package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// Instantiation of list'symptoms
		ReadSymptomDataFromFile listSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> result = listSymptoms.GetSymptoms();

		// Instantiation of counter of symptom
		CountSymptom countSymptom = new CountSymptom();
		TreeMap<String, Integer> listSymptomCheck = countSymptom.CounterMapSymptom(result);

		// Instantiation of file to write TreeMap
		WriteSymptomDataInFile file = new WriteSymptomDataInFile("Project02Eclipse//result.txt");
		file.PutSymptoms(listSymptomCheck);
	}
}
