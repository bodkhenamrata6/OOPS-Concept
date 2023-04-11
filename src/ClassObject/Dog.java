package ClassObject;

public class Dog {
	String name;
	String breed;
	int age;
	String color;
	
	 int weight;  
	
	//public private default protected -modifiers,access specifier
	//if not specifies any modifiers then it takes default -it is access with in class only
	public void setweight(int w) {
		weight=w;
	}
	

	public Dog(String name, String breed, int age, String color) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
         
	

	public String getName() {
		return name;
	}



	public String getBreed() {
		return breed;
	}



	public int getAge() {
		return age;
	}



	public String getColor() {
		return color;
	}
   //Getters and setters are used to protect your data, particularly when creating classes. 
	//getters and setters are also known as accessors and mutators
   @Override
         public String toString() {
	
	return ("Name:"+this.getName()+ " Age:"+this.getAge()+ " Color:"+this.getColor()+ " Breed:"+this.getBreed());
}

	public static void main(String[] args) {
		
		Dog d= new Dog ("tuffy", "papillon", 5, "white");
		
		System.out.println(d.toString());
		
		
	}

}
