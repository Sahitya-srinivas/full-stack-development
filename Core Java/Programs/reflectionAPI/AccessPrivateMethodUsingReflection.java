package reflectionAPI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import string.StringManipulation;

public class AccessPrivateMethodUsingReflection {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		StringManipulation str = new StringManipulation();
		Method[] method = str.getClass().getDeclaredMethods();
		System.out.println("The no of declared methods in "+str.getClass().getSimpleName()+" class are "+method.length+"\n");
		for (Method m : method) {
			System.out.println("Method name: "+m.getName());
			m.setAccessible(true);
			Parameter[] parameter = m.getParameters();
			for (Parameter p : parameter) {
				System.out.println("Argument type is "+p.getType() + " and argument name is " + p.getName() + " and argument modifier is " + p.getModifiers());
			}
			System.out.println("The no of parameters in "+m.getName()+" is "+parameter.length);
			if(!m.getName().equals("main")) {
				m.invoke(str, args);
			}
			System.out.println();
		}
		 
	}
}

