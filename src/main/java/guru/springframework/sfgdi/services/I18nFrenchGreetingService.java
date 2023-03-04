package guru.springframework.sfgdi.services;

public class I18nFrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Bonjour - FR";
    }
}
