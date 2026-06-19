package constructor;
abstract class Demo {
	public int a;

	Demo() {
		this.a = 10;
	}
	public Demo(int a) {
		this();
	}

	abstract void set(int a);

	abstract public void get();

}

class Abstract extends Demo {
	
	public Abstract() {
		this(40);
	}
	
	public Abstract(int a) {
		this.a = a;
	}
	
	 void set(int a) {
		this.a = a;
	}

	public void get() {
		System.out.println("Value = " + this.a);
	}

	public static void main(String[] args) {
		Demo obj = new Abstract();
		obj.set(21);
		obj.get();
		
		Abstract abObj = new Abstract();
		abObj.set(30);
		abObj.get();
		
		Abstract demoObj = new Abstract(50);
		demoObj.get();
		
	}
}
