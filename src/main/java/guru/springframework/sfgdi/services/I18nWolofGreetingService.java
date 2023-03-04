package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.WolofGreetingRepository;

public class I18nWolofGreetingService implements GreetingService{

    private final WolofGreetingRepository wolofGreetingRepository;

    public I18nWolofGreetingService(WolofGreetingRepository wolofGreetingRepository) {
        this.wolofGreetingRepository = wolofGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return wolofGreetingRepository.getGreeting();
    }
}
