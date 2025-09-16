class Base {
    public String str = "Base";

    public void method() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public String str = "Derived";

    public void method() {
        System.out.println("Derived");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base obj = new Derived();
        System.out.println(obj.str);
        obj.method();
    }
}