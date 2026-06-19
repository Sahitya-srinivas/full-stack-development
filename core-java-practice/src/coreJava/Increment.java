package coreJava;
public class Increment
{
	public int firstNumber = 31;
	protected int secondNumber = 32;
	int thirdNumber = 33;
	private int fourthNumber = 34;
	
	public void publicAccessMethod() {
		System.out.println("This is a public Access Method in different method "+this.getClass().getSimpleName());
	}
	
	private void privateAccessMethod() {
		System.out.println("This is a private Access Method in different method "+this.getClass().getSimpleName());
	}
	
	protected void protectedAccessMethod() {
		System.out.println("This is a protected Access Method in different method "+this.getClass().getSimpleName());
	}
	
	void defaultAccessMethod() {
		System.out.println("This is a default Access Method in different method "+this.getClass().getSimpleName());
	}
	
    public static void main(String[] args) {
//        int a = 2;
//        System.out.printf("%d",++a*++a*++a);
    }
}