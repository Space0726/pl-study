package greeter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("Spring");
        System.out.println(msg);

        Greeter ug = ctx.getBean("upperGreeter", Greeter.class);
        String umsg = ug.greet("Hey");
        System.out.println(umsg);

        ctx.close();
    }
}
