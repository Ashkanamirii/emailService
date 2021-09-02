package se.nackademin.emailservice.config;

import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-02
 * Time:  08:47
 * Project: emailService
 * Copyright: MIT
 */
@Component
public class MailConfig {

	@Value("${sendgrid.key}")
	private String key;
	@Value("${sendgrid.from.mail}")
	private String fromEmail;

	private SendGrid sendGrid;

	public String getKey() {
		return key;
	}

	public Email getFromEmail() {
		return new Email(fromEmail);
	}

	public SendGrid getSendGrid() {
		return new SendGrid(key);
	}

}


