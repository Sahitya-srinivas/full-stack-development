package string;
public class StringManipulation {
	
	private void stringReverse() {
		String name = "helloWorld";
		StringBuilder updatedString = new StringBuilder();
		for(int i = 0; i< name.length();) {
			updatedString.append(name.charAt(i+1));
			updatedString.append(name.charAt(i));
			i=i+2;
		}
		System.out.println("Updated String name: "+updatedString.toString());
	}
	
	private void showName() {
		System.out.println("This is String Private Method");
	}
	
	public static void main(String[] args) {
		StringManipulation stringManipulator = new StringManipulation();
		stringManipulator.stringReverse();
		stringManipulator.showName();
	}
}
