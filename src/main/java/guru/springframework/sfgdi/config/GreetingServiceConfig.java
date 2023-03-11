package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.WolofGreetingRepository;
import guru.springframework.sfgdi.repositories.WolofGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:sfgdi-config.xml")
@PropertySource("classpath:datasource.properties")
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                  @Value("${guru.password}") String password,
                                  @Value("${guru.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
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
