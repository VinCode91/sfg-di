package guru.springframework.sfgdi.repositories;

public class WolofGreetingRepositoryImpl implements WolofGreetingRepository{
    @Override
    public String getGreeting() {
        return "Na ngen def, ba Jaam ?";
    }
}
