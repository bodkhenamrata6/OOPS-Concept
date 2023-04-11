package ClassObject;

 public class Box {

	//use class keyword to declare class
	double width;//instance variable
	double height;//instance variable or data member or state
	double depth;
	public void volume() {
		
		System.out.println("Vol is:"+depth*height*width);
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
		
		//if we are giving same name to local variable and instance variable means data member then local variable hiding proprty of instance variable so 
		//use this operator to indicate instance of current class.
		//otherwise it will give default value of double
	}
	
	public double setDimentions() {
		
		
		return depth*height*width;
	}
}
  class BoxDemo {
	public static void main(String[] args) {
		double volume;
     Box b1=new Box(10,80,80);
     volume = b1.setDimentions();
     System.out.println(volume);
     //b1 is object = instance of class
     Box b2=new Box(90,90,90);
      volume = b2.setDimentions();
     System.out.println(volume);
     /*b2=new Box();
     b2.depth=20;
     b2.height=20;
     b2.width=20;
     
     b1.volume();
     b2.volume();
     //using . operator you can access the instance variable.
    double vol=b1.depth*b1.height*b1.width;
    double vol1=b2.depth*b2.height*b2.width;
    System.out.println(vol1);
    System.out.println(vol);
    */
   /* Box b3=b2;
    double vol4=b3.depth*b3.height*b3.width;
    System.out.println(vol4);
    //each time we create an object (instance of a class)
    //we are creating an object that contains own copy of instance variable 
    //local variable-method only
    //instance variable- every object will have copy of instance variable
    //class variable or static variable:it is share across all instance while instance variable are unique to each instance
	}*/

}}
