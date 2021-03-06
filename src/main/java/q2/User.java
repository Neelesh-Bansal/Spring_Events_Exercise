package q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    int id;
    String name;
    int amount;
    int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    int withdrawAmount;

    @Autowired
    private CustomPublisher customPublisher;

    public void withrawMoney(int withdraw)
    {
        withdrawAmount=withdraw;
        customPublisher.publishEvent1(new CustomEvent(this));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
