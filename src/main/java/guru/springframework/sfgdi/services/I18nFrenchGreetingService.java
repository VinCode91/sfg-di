package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("FR")
public class I18nFrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Bonjour - FR";
    }
}
