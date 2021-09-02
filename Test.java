package Basic1;

public class Test {
	public static void main(String[] args) {
		//understanding OBJECT and CLASSES
		Teacher teacher1; // object declare
		teacher1 = new Teacher();
		
		Teacher teacher2 = new Teacher();
		teacher1.name = "Dipraj";
		teacher1.gender = "Male";
		teacher1.phone = 178522;
		
		teacher2.name= "Minhaj";
		teacher2.gender = "Male";
		teacher2.phone = 58966;

		teacher1.displayInfo();
		teacher2.displayInfo();
		teacher1.PrintDipraj("Dipa");
		
		System.out.println(teacher1.sumofTwoDigit(5, 5));
		
		Teacher teacher3 = new Teacher();
		teacher3.usingCons("Dipra", "mama", 256565);
		teacher3.displayInfo();
		
	}
}
