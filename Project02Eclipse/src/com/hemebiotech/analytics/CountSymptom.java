package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptom {

	TreeMap<String, Integer> map = new TreeMap<String, Integer>();

	public TreeMap<String, Integer> CounterMapSymptom(List<String> listOfSymptoms) {

		int countSymptom = 0;

		for (String symptom : listOfSymptoms) {
			countSymptom = 0;
			for (String symptom1 : listOfSymptoms) {
				if (symptom1.equals(symptom)) {
					countSymptom++;
				}
			}
			map.put(symptom, countSymptom);
		}

		return map;
	}
}
