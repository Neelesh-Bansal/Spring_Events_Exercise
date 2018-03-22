package q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);

        User user=applicationContext.getBean(User.class);
        user.setName("nakul");
        user.setPin(1111);
        user.newPin(2222);

        }


    }
