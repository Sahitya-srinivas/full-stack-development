// Pass by Value with Primitive
// public class Test{
//     static void changeValue(int x){
//         x = 20;
//     }
//     public static void main(String[] args) {
//         int a = 10;
//         changeValue(a);
//         System.out.println(a);
//     }
// }

// Pass by Value with Object
// class Dog{
//     String name;
//     Dog(String name){
//         this.name = name;
//     }
// }
// public class Test{
//     static void changeName(Dog d){
//         d.name = "Bruno";
//     }
//     public static void main(String[] args) {
//         Dog dog = new Dog("Snoopy");
//         changeName(dog);
//         System.out.println(dog.name);
//     }
// }

// Reassigning the reference
// class Dog{
//     String name;
//     Dog(String name){
//         this.name = name;
//     }
// }
// public class Test{
//     static void changeName(Dog d){
//         d = new Dog("Bruno");
//     }
//     public static void main(String[] args) {
//         Dog dog = new Dog("Snoopy");
//         changeName(dog);
//         System.out.println(dog.name);
//     }

//     void set1(int i) {
//         throw new UnsupportedOperationException("Not supported yet.");
//     }
// }


class Demo1 {
    int num;
    Demo1() {
        this(100,200);
        System.out.println("Default Constructor");
    }
    Demo1(int n) {
        num = n;
        System.out.println("Parameterized Constructor");
    }   
     Demo1(int n, int m) {
        num = m;
        System.out.println("Second Constructor");
    }
}
public class Test {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        System.out.println(obj.num);
    }
}





