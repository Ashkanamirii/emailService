package se.nackademin.emailservice.config;

import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-02
 * Time:  08:47
 * Project: emailService
 * Copyright: MIT
 */
@ComponentScan
@Configuration
public class MailConfig {

	@Value("${sendgrid.key}")
	private String key;

	@Value("${sendgrid.from.mail}")
	private String fromEmail;

	@Bean
	public Email getFromEmail() {
		return new Email(this.fromEmail);
	}

	@Bean
	public SendGrid getSendGrid() {
		return new SendGrid(this.key);
	}

}


