package se.nackademin.emailservice.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.nackademin.emailservice.EmailRequest;

import java.io.IOException;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:48
 * Project: emailService
 * Copyright: MIT
 */


@Service
public class Emailservice {


	@Autowired
	SendGrid sendGrid;

	public Response sendemail(EmailRequest emailrequest) {

		Mail mail = new Mail(new Email("Hakim.Livs.grp3@gmail.com"),
				emailrequest.getSubject(), new Email(emailrequest.getTo()),
				new Content("text/plain", emailrequest.getBody()));
	
		Request request = new Request();

		Response response = null;

		try {

			request.setMethod(Method.POST);

			request.setEndpoint("mail/send");

			request.setBody(mail.build());

			response = this.sendGrid.api(request);

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

		return response;
	}


}
