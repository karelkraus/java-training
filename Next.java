public class Next {

	static void myStatic() {
		System.out.println("This is static method");
	}

	public void myMethod(String name, int number) {
		System.out.println("Hey, my name is " + name + " and my favorite number is " + number);
	}

	public static void main(String[] args) {
		Next myName = new Next();
		//calling the public method
		myName.myMethod("Franta", 23);
		//calling the static method
		myStatic();
		// creating class from the first file
		Main myObj = new Main();
		System.out.println(myObj.greeting + " " + myObj.gender + myObj.lname);
		// setting and getting number from the first file
		myObj.setInsurance(39103132);
		System.out.println(myObj.getInsurance());
	}
}