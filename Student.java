package in.ab.beans;

public class Student {
private int roll_num;
private String name;
private String email;
public int getRoll_num() {
	return roll_num;
}
public void setRoll_num(int roll_num) {
	this.roll_num = roll_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void display() {
	
	
	System.out.println("Name    "+name);
	System.out.println("email   "+email);
	System.out.println("Roll Number  "+roll_num);
}
}
