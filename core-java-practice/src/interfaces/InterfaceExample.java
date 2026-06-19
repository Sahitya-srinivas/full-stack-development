package interfaces;

interface InterfaceDemo {
	
	public static final int number = 10;
	
	abstract void display();
	
	default int calculate(short a, int b) {
		return a + b;
	}
	default int calculate(int a, short b) {
		defaultHiddenMethod();
		return a - b;	
	}
	
	static float calculateInterest(int principle, int time, int rate) {
		hiddenMethod();
		System.out.print("The Simple Interest of amount "+principle+" with interest of "+rate+"% for "+time+" years is : ");
		return (principle*time*rate)/100;
	}
	private static void hiddenMethod() {
		System.out.println("This is a Private Method");
	}
	private void defaultHiddenMethod() {
		System.out.println("This is a Default private Method");
	}
	
}

public class InterfaceExample implements InterfaceDemo {
	
	public void display() {
		System.out.println("The number is :"+number);
	}
	
	@Override
	public int calculate(int num1, short num2) {
		return num1*num2;
	}	

	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new InterfaceExample();
		interfaceDemo.display();
		System.out.println(interfaceDemo.calculate((int)30,(short)20));
		System.out.println(interfaceDemo.calculate((short)2,(int)6));
		System.out.println(InterfaceDemo.calculateInterest(200000, 1, 8));
		
	}

}
