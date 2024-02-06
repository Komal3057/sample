class A {
    int a, b;

    void show() {
        System.out.println("Show() of Base Class");
    }
}

class B extends A {
    int k;

    void show() {
        System.out.println("Show() of Child Class");
    }
}

public class DriverClass {
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        aa.a = 50;
        bb.b = 30;
        // aa does not have a variable k, so the next line will result in a compilation error
        // aa.k = 56;--compile time error
        bb.k = 78;
    }
}
