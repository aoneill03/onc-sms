package onc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.twilio.Twilio;
import onc.config.ConfigManager;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// Initialize Twilio for SMS Sending
		Twilio.init(
			ConfigManager.getInstance().getProperty("ACCOUNT_SID"), 
			ConfigManager.getInstance().getProperty("AUTH_TOKEN"));

		// Create Sping REST Application
		SpringApplication.run(Application.class, args);
	}
}
