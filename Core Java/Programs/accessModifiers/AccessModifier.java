package accessModifiers;

class AccessModifier {
	
	public int firstNumber = 11;
	protected int secondNumber = 12;
	int thirdNumber = 13;
	private int fourthNumber = 14;

	public void publicAccessMethod() {
		System.out.println("This is a public Access Method in same Package "+this.getClass().getSimpleName());
	}
	
	private void privateAccessMethod() {
		System.out.println("This is a private Access Method in same Package "+this.getClass().getSimpleName());
	}
	
	protected void protectedAccessMethod() {
		System.out.println("This is a protected Access Method in same Package "+this.getClass().getSimpleName());
	}
	
	void defaultAccessMethod() {
		System.out.println("This is a default Access Method in same Package "+this.getClass().getSimpleName());
	}
	
}
