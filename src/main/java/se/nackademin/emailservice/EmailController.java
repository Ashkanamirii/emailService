package se.nackademin.emailservice;

import com.sendgrid.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import se.nackademin.emailservice.service.Emailservice;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:53
 * Project: emailService
 * Copyright: MIT
 */
@RestController
@RequestMapping("/mail")
@CrossOrigin
public class EmailController {

	@Autowired
	private Emailservice emailservice;

	@PostMapping("/sendemail")
	public ResponseEntity<Object> sendemail(@RequestBody EmailRequest emailrequest) {

		Response response = emailservice.sendemail(emailrequest);
		if (response.getStatusCode() == 200 || response.getStatusCode() == 202){
			EmailResponse emailResponse = new EmailResponse("send successfully");
			return  ResponseEntity.ok(emailResponse);
		}

		return new ResponseEntity<>("failed to sent", HttpStatus.NOT_FOUND);
	}
}
