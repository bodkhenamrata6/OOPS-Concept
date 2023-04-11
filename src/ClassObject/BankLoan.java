package ClassObject;

public class BankLoan {

   private String name;
   private int age;
   private double amount;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=18 && age<60)
		
	this.age = age;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
   
}
