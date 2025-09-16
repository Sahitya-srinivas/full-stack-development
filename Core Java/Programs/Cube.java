//class Derived1 extends Base1 {
//	Derived1() {
//		System.out.print("D");
//	}
//}
//
//class Base1 {
//	Base1() {
//		System.out.print("B");
//	}
//}
//
//class Parameter {
//	public static void main(String[] args)
//    {
//        Derived1 obj1 = new Derived1();
//    }   
//}


class Cube
{
    float num;
    public Cube(int num)
    {
        this.num=num*num*num;
    }
    public Cube(char num)
    {
        this.num=num*num*num;
    }
    void Display()
    {
        System.out.println(num);
    }
    public static void main(String[] args) 
    {
        Cube obj=new Cube(3);
        Cube obj2 = new Cube('A');
        obj2.Display();
        obj.Display();
    }
}