Let's take the below Java code and explain the given 4 statements:



class Animal {

&nbsp;   void sound() {

&nbsp;	 System.out.println("Animal makes a sound"); 

&nbsp;   }

}

class Dog extends Animal {

&nbsp;   @Override

&nbsp;   void sound() {

&nbsp;	 System.out.println("Dog barks"); 

&nbsp;   }

}

public class Test {

&nbsp;   public static void main(String\[] args) {

&nbsp;       //1. Animal a = new Dog(); 

&nbsp;	//2. Animal a = new Animal(); 

&nbsp;	//3. Dog a = new Dog(); 

&nbsp;	//4. Dog a = new Animal();  

&nbsp;       a.sound(); 

&nbsp;   }

}



1\. Animal a = new Dog();

&nbsp;	Here the reference type is Animal but the object type is Dog.

&nbsp;	At compile time, the compiler looks at the reference type (Animal) to check if sound() exists → Yes.

&nbsp;	At runtime, the JVM looks at the actual object (Dog) and executes Dog’s sound().

&nbsp;	This is runtime polymorphism (method overriding).

&nbsp;	Output: **Dog barks**



2\. Animal a = new Animal();

&nbsp;	Both the reference and object are Animal.

&nbsp;	The sound() method of Animal will be executed since no overriding is involved here.

&nbsp;	Output: **Animal makes a sound**



3\. Dog a = new Dog();

&nbsp;	Both reference and object are Dog.

&nbsp;	The method resolution will directly go to Dog’s overridden method.

&nbsp;	No polymorphism is involved (simple method call).			

&nbsp;	Output: **Dog barks**



4\. Dog a = new Animal(); ❌ Compilation Error

&nbsp;	Here, the reference type is Dog and the object type is Animal.

&nbsp;	Java does not allow assigning a parent object to a child reference directly, because not all Animal objects are Dog.

&nbsp;	Example: You cannot guarantee that a generic Animal (like Cat or Bird) has Dog-specific behavior.

&nbsp;	If you try this, the compiler will give: **incompatible types: Animal cannot be converted to Dog**





Summary Table :

Case				Valid?		Behavior / Output

Animal a = new Dog();		✅ Yes		Dog barks (runtime polymorphism)

Animal a = new Animal();	✅ Yes		Animal makes a sound

Dog a = new Dog();		✅ Yes		Dog barks (direct call, no polymorphism)

Dog a = new Animal();		❌ No		Compilation error (Animal → Dog not allowed)





Let’s extend the above example with **instanceof** to safely handle downcasting in Java.

class Animal {

    void sound() {

 	 System.out.println("Animal makes a sound");

    }

}

class Dog extends Animal {

    @Override

    void sound() {

 	 System.out.println("Dog barks");

    }

}

public class Test {

&nbsp;   public static void main(String\[] args) { 

&nbsp;       Animal a1 = new Dog();     // Upcasting (always safe)

&nbsp;       Animal a2 = new Animal();  // Plain Animal



&nbsp;       // Safe downcasting with instanceof

&nbsp;       if (a1 instanceof Dog) {

&nbsp;           Dog d1 = (Dog) a1;

&nbsp;           d1.sound(); // Dog barks

&nbsp;       }



&nbsp;       if (a2 instanceof Dog) {

&nbsp;           Dog d2 = (Dog) a2;

&nbsp;           d2.sound(); // This block won't execute

&nbsp;       } else {

&nbsp;           System.out.println("a2 is not a Dog");

&nbsp;       }

&nbsp;   }

}



Output : 

Dog barks

a2 is not a Dog



Upcasting (Child → Parent) is always safe.

Example: 

Animal a = new Dog(); ✅



Downcasting (Parent → Child) is risky and must be checked with instanceof.

Example:

if (a instanceof Dog) {

&nbsp;   Dog d = (Dog) a;

}



