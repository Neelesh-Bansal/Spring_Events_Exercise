package q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);

        User user=applicationContext.getBean(User.class);
        user.setName("nakul");
        user.setPin(2222);
        user.changeMobile(12345);

        }


    }
