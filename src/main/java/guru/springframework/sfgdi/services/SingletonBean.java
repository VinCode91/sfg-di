package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a slingleton bean !");
    }

    public String getMyScope() {
        return "I'm a singleton";
    }
}
