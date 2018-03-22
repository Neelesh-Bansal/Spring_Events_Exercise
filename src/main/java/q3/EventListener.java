package q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<CustomEvent>{
//    @Override
//    public void onApplicationEvent(ApplicationEvent event) //called by spring whenever any Application event is published
//    {
//
//    }
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void onApplicationEvent(CustomEvent event)
    {


        User user = (User)event.getSource();
        int withdraw=user.withdrawAmount;
        String name= user.getName();
        int oldPin=user.getPin();
        int newPin=user.getNewPin();
        jdbcTemplate.update("update user set pin=? where name=? and pin=?",new Object[]{newPin,name,oldPin});

        System.out.println("Pin changed Successfully");
    }


}
