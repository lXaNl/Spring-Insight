package spring.from.inside;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsideApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsideApplication.class, args);
    }


}
