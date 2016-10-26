
public class VariableDemo {
	
	public static void main(String[] args) {
		
		int numberOfCows, numberOfChickens, numberOfHorses, totalNumberOfAnimals;
		numberOfCows = 12;
		numberOfChickens = 35;
		numberOfHorses = 17;
		totalNumberOfAnimals = numberOfCows + numberOfChickens + numberOfHorses;
		
		double cowFeedCost, chickenFeedCost, horseFeedCost;
		cowFeedCost = 3.25;
		chickenFeedCost = 0.65;
		horseFeedCost = 5.55;
		
		double totalCowCost, totalChickenCost, totalHorseCost, totalAnimalCost;
		totalCowCost = numberOfCows * cowFeedCost;
		totalChickenCost = numberOfChickens * chickenFeedCost;
		totalHorseCost = numberOfHorses * horseFeedCost;
		totalAnimalCost = totalCowCost + totalChickenCost + totalHorseCost;
		
		String firstName, lastName;
		firstName = "Sam";
		lastName = "Mattson";
		
		System.out.println(lastName + ", " + firstName);
		System.out.println();
		System.out.print("\n");
		System.out.println("There are " + totalNumberOfAnimals + " animals on the farm.");
		System.out.println("It cost $" + totalAnimalCost + " to feed all the farm.");
		
	}

}
