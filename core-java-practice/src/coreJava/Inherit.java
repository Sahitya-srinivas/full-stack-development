package coreJava;

class Parent{
	public void show() {
		System.out.println("This is Parent");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("This is Child");
	}
}


public class Inherit {

	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.show();
		Child c1 = new Child();
		c1.show();
		Parent p2 = new Parent();
		p2.show();
//		Child c2 = new Parent();
//		c2.show();
	}

}
