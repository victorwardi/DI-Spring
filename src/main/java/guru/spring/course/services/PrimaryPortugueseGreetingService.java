package guru.spring.course.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("pt  ")
public class PrimaryPortugueseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Faallaaa Galera!";
    }
}
