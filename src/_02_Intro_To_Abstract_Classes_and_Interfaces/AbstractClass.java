package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class AbstractClass extends AbstractClassDemo implements InterfaceDemo, DemoInterface{
	public static void main(String[] args) {
		AbstractClass d = new AbstractClass();
		d.abstractDemo();
	}
	public void abstractDemo() {
		System.out.println("abstractDemo");
	}

	public int abstractNumDemo() {
		return 0;
	}
	@Override
	public String faceDemo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double interDemo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
