package accessModifiers;
import coreJava.*; 

public class AccessModifierExample {
	
	public int firstNumber = 01;
	protected int secondNumber = 02;
	int thirdNumber = 03;
	private int fourthNumber = 04;
	
	
	public void publicAccessMethod() {
		System.out.println("This is a public Access Method in same class "+this.getClass().getSimpleName());
	}
	
	private void privateAccessMethod() {
		System.out.println("This is a private Access Method in same class "+this.getClass().getSimpleName());
	}
	
	protected void protectedAccessMethod() {
		System.out.println("This is a protected Access Method in same class "+this.getClass().getSimpleName());
	}
	
	void defaultAccessMethod() {
		System.out.println("This is a default Access Method in same class "+this.getClass().getSimpleName());
	}
	
	public void displayMethod() {
		System.out.println(this.firstNumber+" "+this.secondNumber+" "+this.thirdNumber+" "+this.fourthNumber);
	}
	
	public static void main(String[] args) {
		
		AccessModifierExample ame = new AccessModifierExample();
		System.out.println("Same Package Same Class ===========================>");
		ame.publicAccessMethod();
		ame.protectedAccessMethod();
		ame.defaultAccessMethod();
		ame.privateAccessMethod();
		System.out.println(ame.firstNumber+" "+ame.secondNumber+" "+ame.thirdNumber+" "+ame.fourthNumber);
		System.out.println("Same Package Different Class ======================>");
		AccessModifier am = new AccessModifier();
		am.publicAccessMethod();
		am.protectedAccessMethod();
		am.defaultAccessMethod();
//		am.privateAccessMethod();
		System.out.println(am.firstNumber+" "+am.secondNumber+" "+am.thirdNumber);
		System.out.println("Different Package Sub Class =======================>");
		SubClassExample sce = new SubClassExample();
		sce.publicAccessMethod();
		sce.protectedAccessMethod();
//		sce.defaultAccessMethod();
//		sce.privateAccessMethod();
		System.out.println(sce.firstNumber+" "+sce.secondNumber);
		System.out.println("Different Package Different Class =================>");
		Increment inc = new Increment();
		inc.publicAccessMethod();
//		inc.protectedAccessMethod();
//		inc.defaultAccessMethod();
//		inc.privateAccessMethod();
		System.out.println(inc.firstNumber);
	}

}
