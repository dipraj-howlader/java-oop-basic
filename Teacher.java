package Basic1;

public class Teacher {
	String name, gender;
	int phone;
	
	// method
	void displayInfo () {
		System.out.println("Name " + name);
		System.out.println("Gender " + gender);
		System.out.println("Phone " + phone);

	}
	
	//Passing Parameter
	
	void PrintDipraj(String name) {
		System.out.println(name);
	}
	void usingCons (String nme, String gen, int num) {
		name = nme;
		gender = gen;
		phone = num;
	}
	// returning  values
	
	double sumofTwoDigit (int a ,int b) {
		return a+b;
	}
}
