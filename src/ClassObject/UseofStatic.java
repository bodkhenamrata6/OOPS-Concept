package ClassObject;

public class UseofStatic {

	
	//class member which is independent of objects
	//by using static keyword we can use it
	//both methods and variables are statics
	//static keywords is used for memory management
	//constructor cannot be static
	//static method can be invoked without creating an object
	//static methods can access static members
	
	static int a=1;
	static int b;
	
	 static void  method01(int x) {
			System.out.println("Value of x "+x);
			System.out.println("Value of a "+a);
			System.out.println("Value of b "+b);
		}

	 static {
		 b=a*2;
	 }
	public static void main(String[] args) {
		
		method01(5);
	}

}
