package interfaces;

interface InterfaceExtendsExample {

	abstract void doAction();

	abstract void doAnotherAction();
}

interface IntefaceAction extends InterfaceExtendsExample {

	abstract void setAction();

	abstract void setAction1();

}

public class InterfaceInheritance implements IntefaceAction {

	public void doAction() {
		System.out.println("It has some action to do");
	}

	public void doAnotherAction() {
		System.out.println("This does another method of action");
	}
	
	public void setAction() {
		System.out.println("It set some methods");
	}
	public void setAction1() {
		System.out.println("It set more methods");
	}

	public static void main(String[] args) {
		IntefaceAction interAction = new InterfaceInheritance();
		interAction.doAction();
		interAction.doAnotherAction();
		interAction.setAction();
		interAction.setAction1();
	}
}