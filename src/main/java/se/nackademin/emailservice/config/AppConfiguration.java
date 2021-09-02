package se.nackademin.emailservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.nackademin.emailservice.config.MailConfig;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:40
 * Project: emailService
 * Copyright: MIT
 */


@Configuration
public class AppConfiguration {

	@Bean
	public MailConfig getMailConfig() {
		return new MailConfig();
	}

}