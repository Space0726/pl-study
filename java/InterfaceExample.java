interface Example {
    public int getFoo();

    public void setFoo(int foo);

    public int getBar();

    public void setBar(int bar);
}

public class InterfaceExample implements Example{
    private int foo;
    private int bar;

    public InterfaceExample(int foo, int bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public int getBar() {
        return this.bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public static void main(String[] args) {
        Example ex = new InterfaceExample(10, 20);

        System.out.println(ex.getFoo());
        System.out.println(ex.getBar());

        ex.setFoo(1);
        ex.setBar(2);
        System.out.println(ex.getFoo());
        System.out.println(ex.getBar());
    }
}
