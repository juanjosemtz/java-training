package labs;

import java.util.Random;

public class StudentApp {

	public static void main(String[] args) {
		Student student01 = new Student("Juan","Martinez","123456789");
		System.out.println(student01.toString());
		student01.checkBalance();
		student01.pay(1000);
		student01.showCourses();
	}

}

class Student {
	private static int ID = 1000;
	private String firstname;
	private String lastname;
	private String SSN; //9 digits
	private static String eMailSufix = "@school.com";
	private String eMail;
	private String studentID; //ID + 4-digit random number between 1000 and 9000 + last 4 of SSN
	private String phone;
	private String city;
	private String state;
	private double Balance;
	private double inscription = -1000;
	
	public Student(String firstname,String lastname, String SSN) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.SSN = SSN;
		
		this.eMail = firstname + "." + lastname + eMailSufix;
		
		ID++;
		Random random = new Random();
		int randomNum = random.nextInt(8000)+1000;
		studentID = ""+ ID + randomNum + SSN.subSequence(5, 9);
		
		Balance = inscription;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void enroll() {
		System.out.println("Enrolling Student...");
	}
	public void pay(double amount) {
		Balance = Balance + amount;
		System.out.println("Student new balance after paying $" + amount + " is: $" + Balance);	
	}
	public void checkBalance() {
		System.out.println("Student balance: $" + Balance);
	}
	public String toString() {
		return firstname + " " + lastname + " (" + studentID + ")";
	}
	public void showCourses() {
		System.out.println("Courses for Student: Math, Pokemon 101, ...");
	}
}