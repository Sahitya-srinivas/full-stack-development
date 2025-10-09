package generics;

class Box<T>{
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;	
	}
}

public class GenericExample {

	public static void main(String[] args) {
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(10);
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		strBox.set("Hello");
		System.out.println(strBox.get());
		
	}

}
