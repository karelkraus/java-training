import java.util.Scanner;

class Something {
	public void sound() {
		System.out.println("This is something");
	}
	class Inside {
		String msg = "Hello, I\'m trapped within class";
	}
}

class Nothing extends Something {
	public void sound() {
		System.out.println("This is nothing");
	}
}

public class User {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String fname;
		String lname;
		int age;

		System.out.println("Enter your first name:");
		fname = myObj.nextLine();
		System.out.println("Enter your last name:");
		lname = myObj.nextLine();
		System.out.println("Enter your age:");
		age = myObj.nextInt();

		System.out.println("User: " + fname + " " + lname + " Age: " + age);

		//trying the inheritence
		Something newThing = new Something();
		Nothing newThing2 = new Nothing();
		newThing.sound();
		newThing2.sound();

		Something.Inside myInside = newThing.new Inside();
		System.out.println(myInside.msg);
	}
}