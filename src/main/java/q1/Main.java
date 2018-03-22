package q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        CustomPublisher customPublisher=applicationContext.getBean(CustomPublisher.class);
        Employee employee1=new Employee(1,"xyz","xyz@",32000);
        Employee employee2=new Employee(2,"abc","abc@",25000);
        Employee employee3=new Employee(3,"pqr","pqr@",31000);

        List<Employee> list=new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        for(Employee employee:list){
            CustomEvent customEvent=new CustomEvent(employee);
        customPublisher.publishEvent1(customEvent);

            System.out.println("rest of the code");
        }


    }
}
