package greeter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public Greeter greeter() {
        Greeter g = new Greeter();
        g.setFormat("%s, Hello!");
        return g;
    }

    @Bean
    public Greeter upperGreeter() {
        Greeter g = new Greeter();
        g.setFormat("%s, Bye!");
        g.setUpper();
        return g;
    }
}
