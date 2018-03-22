package q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);

        User user=applicationContext.getBean(User.class);
        user.setName("nakul");
        user.setPin(1111);
        user.withrawMoney(300);

        }


    }
