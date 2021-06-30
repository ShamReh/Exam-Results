package com.qa.helloworld;

public class ResultsMethods {

	public static int physicsResult = 46;
	public static int biologyResult = 99;
	public static int chemistryResult = 150;
	public static int Total = physicsResult + biologyResult + chemistryResult;

	public static int Overall() {
		int total = physicsResult + biologyResult + chemistryResult;
		return total;
	}

	public static double Percentage() {
		double percentage = ((Total) * 100) / 450;
		return percentage;
	}
}
