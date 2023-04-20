package ClassObject;

public class InheritanceDemo  {

	public static void main(String[] args) {
		InheritanceA parent = new InheritanceA();
		InheritanceB child = new InheritanceB();
		InheritanceC childofA =new InheritanceC(100,200);
		
		//parent.a=10;
		//parent.b=20;
		//parent.showab();
	/*	
		child.a=30;
		child.b=40;
		child.c=50;
		child.showab();
		child.showc();
		*/
		
		
		childofA.show();
		

	}

}
