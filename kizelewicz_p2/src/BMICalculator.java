import java.util.Scanner;

public class BMICalculator {

	double weight;
	double height;
	double BMI;
	double BMICategory;
	
	public void readUserData() {
		//makes use of readUnitType and readMeasurementData
		readUnitType();
	}
	
	private void readUnitType() {
		System.out.println("Press 1 for metric or 2 for Imperial");
		readMeasurementData();

	}
	
	private void readMeasurementData() {
		//calls either readMetricDate or readImperialData depending
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		if(input == 1) {
			readMetricData();
		}
		else if(input == 2) {
			readImperialData();
		}
		else {
			System.out.println("1 or 2 not entered.");
		}
		scan.close();
	}
	
	private void readMetricData() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weight: ");
		weight = scan.nextDouble();
		weight = weight / 703;
		System.out.println("Enter height: ");
		height = scan.nextDouble();
		scan.close(); 
	}
	
	private void readImperialData() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weight: ");
		weight = scan.nextDouble();
		System.out.println("Enter height: ");
		height = scan.nextDouble();
		scan.close(); 
	}
	
	public void calculateBmi() {
		
		BMI = weight / ( height * height);
		calculateBmiCategory(BMI);
		
		System.out.println("Bmi: ");
	}
	
	private void calculateBmiCategory(double BMI) {
		if(BMI <= 18.5) {
			System.out.println("Underweight");
		}
		else if(BMI > 18.5 && BMI < 25) {
			System.out.println("Normal weight");
		}
		else if(BMI > 25 && BMI < 30) {
			System.out.println("Overweight");
		}
		else if(BMI > 30){
			System.out.println("Obesity");
		}
	}
	
	public void displayBmi() {
		//prints the value & category
		System.out.println(BMI);
	}
	
	public double getWeight() {
		return weight;
	}
	
	private void setWeight(double weight1) {
		weight = weight1;
	}
	
	public double getHeight() {
		return height;
	}
	
	private void setHeight(double height1) {
		height = height1;
	}
	
	public double getBmi() {
		return BMI;
	}
	
	public double getBmiCategory() {
		return BMICategory;
	}
}
