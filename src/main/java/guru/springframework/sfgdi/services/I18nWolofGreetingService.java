package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SN", "default"})
@Service("i18nService")
public class I18nWolofGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Naka suba si - Wolof";
    }
}
