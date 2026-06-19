package reflectionAPI;

import java.lang.reflect.InvocationTargetException;

class Main {

	String name;
	int id;
	
	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Main() {
	}

	public Main(String name, int id) {
		System.out.println("Name is " + name + " Id is " + id);
	}

	private void displayName() {
		System.out.println("Hi, This is Private method");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException   {
	
		Main m = new Main();
		System.out.println(m.hashCode());
		m.displayName();
		Main m2;
		try { 
			m2 = (Main)Class.forName("reflectionAPI.Main").getConstructor(String.class, int.class).newInstance("Priya", 3428);
			System.out.println(m2.hashCode());
			System.out.println(m2.getName()+" "+m2.getId());
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
	}
}
