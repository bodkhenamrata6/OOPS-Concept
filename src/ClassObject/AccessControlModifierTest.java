package ClassObject;

public class AccessControlModifierTest {

	public static void main(String[] args) {
		AccessControlModifierDemo ac= new AccessControlModifierDemo();
		
		ac.a=10;
		ac.b=20;
		ac.setC(30);
        System.out.println(+ac.a);
        System.out.println(+ac.b);
        System.out.println(+ac.getC());
	}

}
