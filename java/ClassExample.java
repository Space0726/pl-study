class Example {
    private int foo, bar;

    public Example(int foo, int bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public int getFoo() {
        return this.foo;
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
}

public class ClassExample {
    public static void main(String[] args) {
        Example example = new Example(10, 20);

        System.out.println(example.getFoo());
        System.out.println(example.getBar());

        example.setFoo(1);
        example.setBar(2);
        System.out.println(example.getFoo());
        System.out.println(example.getBar());
    }
}
