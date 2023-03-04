package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repositories.WolofGreetingRepository;
import guru.springframework.sfgdi.repositories.WolofGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }
    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
    @Bean("i18nService")
    @Profile("FR")
    I18nFrenchGreetingService i18nFrenchGreetingService() {
        return new I18nFrenchGreetingService();
    }

    @Bean
    WolofGreetingRepository wolofGreetingRepository() {
        return new WolofGreetingRepositoryImpl();
    }
    @Profile({"SN", "default"})
    @Bean("i18nService")
    I18nWolofGreetingService i18nWolofGreetingService(WolofGreetingRepository wolofGreetingRepository) {
        return new I18nWolofGreetingService(wolofGreetingRepository);
    }
}
