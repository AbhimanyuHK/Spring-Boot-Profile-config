package spring_boot_config.spring_boot_profile_config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	@Autowired
	private CmdbProperties cmdbProperties;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void init() {

		logger.info(cmdbProperties.toString());
	}
}
