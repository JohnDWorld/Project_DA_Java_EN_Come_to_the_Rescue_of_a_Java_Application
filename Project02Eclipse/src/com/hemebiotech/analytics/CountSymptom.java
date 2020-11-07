package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Class with a method to count the number of each symptom from a list
 *
 * @author JohnDWorld
 *
 */
public class CountSymptom {

	// Instantiation of a treeMap where to put each symptom and his count
	TreeMap<String, Integer> map = new TreeMap<String, Integer>();

	/**
	 * Method that will analysis a list of symptom and will count each of them
	 *
	 * @param listOfSymptoms list string of symptom
	 * @return the map with each symptom and his count
	 */
	public TreeMap<String, Integer> CounterMapSymptom(List<String> listOfSymptoms) {

		int countSymptom = 0;
		for (String symptomAnalysis : listOfSymptoms) {
			/*
			 * Loop to take a symptom to analysis and to put at the end the symptom analysis
			 * and his count in the treemap
			 */
			countSymptom = 0; // Restart the count
			for (String symptom : listOfSymptoms) {
				/*
				 * Loop to compare a symptom with the symptoms in list and increase the counter
				 * of the symptom each time the symptom analysis is equals to the symptom of the
				 * list
				 */
				if (symptom.equals(symptomAnalysis)) {
					countSymptom++;
				}
			}
			map.put(symptomAnalysis, countSymptom);
		}
		return map;
	}
}
