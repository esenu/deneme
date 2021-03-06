package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("endpoints")
@ComponentScan("hello")
@ComponentScan("SecurityTwo")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}