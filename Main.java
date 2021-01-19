public class Main {
	// test to connect with second file
	String greeting = "Hello";
	String gender = "Mr.";
	String lname = "Bell";

	//creating getter and setter
	private int insuranceNo;

	public int getInsurance() {
		return insuranceNo;
	}

	public void setInsurance(int newInsurance) {
		this.insuranceNo = newInsurance;
	}


	static void myMethod(String nick, int age2) {
		String access = (age2 > 18) ? "Hey " + nick + ", you can enter :)" : "You are too young " + nick + ", go home!";
		System.out.println(access);
	}
	public static void main(String[] args) {
		//creating variable
		String name = "Johnik";
		int age = 22;
		//random number
		int randomNo = (int)(Math.random()*101);
		//printing variable
		System.out.println("Hello there, my name is " + name + " and my age is " + age);
		/*if (randomNo > 50) {
			System.out.println("Today lucky number is greater than 50 (" + randomNo + ")");
		} else {
			System.out.println("Today lucky number is smaller than 50 (" + randomNo + ")");
		}*/
		//shorter version of if statement from above
		String result = (randomNo > 50) ? "Today lucky number is greater than 50 (" + randomNo + ")" : "Today lucky number is smaller than 50 (" + randomNo + ")";
		System.out.println(result);
		//array of cars
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// for each loop
		for(String i : cars) {
			System.out.println(i);
		}
		// calling the method
		myMethod("Fred", 17);
	}
}