package se.nackademin.emailservice;
import com.sendgrid.helpers.mail.objects.Content;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:43
 * Project: emailService
 * Copyright: MIT
 */
@Getter
@Setter
@NoArgsConstructor
public class EmailRequest {

	private String to;
	private String subject;
	private String body;

	public EmailRequest(String to, String subject, String body) {
		super();
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
}
