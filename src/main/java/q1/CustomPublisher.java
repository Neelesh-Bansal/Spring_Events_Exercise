package q1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomPublisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("set application Event");
        publisher = applicationEventPublisher;
    }

    public void publishEvent1(CustomEvent customEvent){
        Employee employee=(Employee)customEvent.getSource();
        if(employee.getSalary()>30000)
        {
            publisher.publishEvent(customEvent);
        }

    }
}
