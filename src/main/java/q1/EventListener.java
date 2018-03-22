package q1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<CustomEvent>{
//    @Override
//    public void onApplicationEvent(ApplicationEvent event) //called by spring whenever any Application event is published
//    {
//
//    }

    @Override
    public void onApplicationEvent(CustomEvent event)
    {
        Employee employee = (Employee)event.getSource();
        System.out.println(employee.getName() + " has salary greater than 30000: " + employee.getSalary());
    }
}
