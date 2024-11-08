package dev.bucsa.run_tracker;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.bucsa.run_tracker.run.Location;
import dev.bucsa.run_tracker.run.Run;



// Note 2.1
// import WelcomeMessage;

@SpringBootApplication
public class Application {

	// Note 2.3 
	// This the code for a logger
	private  static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		// Note 2.1
		// This is the simplest way of putting an "Welcome message" from an imported file/package. 
		// 	var welcomeMessage = new WelcomeMessage();
		// 	System.out.println(welcomeMessage.getWelcomeMessage());

		// Note 2.2
		// Below is an example of congifuration control 
		// ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		// WelcomeMessage welcomeMessage = context.getBean(WelcomeMessage.class);
        // System.out.println(welcomeMessage.getWelcomeMessage());

		SpringApplication.run(Application.class, args);
		
		// Note 2.4 
		// These send out messages to the terminal that are readable and update when the file is saved.
		// log.info("Application started successfully");
		// log.info("Something Changed");
	}

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
            log.info("Run: " + run);
        };
	}

}
