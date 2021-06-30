package com.qa.helloworld;

public class OperatorsResults {

	public static void main(String[] args) {
		System.out.println("Physics Result: " + ResultsMethods.physicsResult);

		System.out.println("\nBiology Result: " + ResultsMethods.biologyResult);

		System.out.println("\nChemistry Result: " + ResultsMethods.chemistryResult);

		System.out.println("\nOverall Result: " + ResultsMethods.Overall());

		System.out.println("\nOverall Percentage: " + ResultsMethods.Percentage());

	}
}
