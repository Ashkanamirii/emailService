package se.nackademin.emailservice;

import com.sendgrid.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.nackademin.emailservice.service.Emailservice;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:53
 * Project: emailService
 * Copyright: MIT
 */
@Controller
public class EmailController {

	@Autowired
	private Emailservice emailservice;

	@PostMapping("/sendemail")
	public ResponseEntity<String> sendemail(@RequestBody EmailRequest emailrequest) {

		Response response = emailservice.sendemail(emailrequest);
		if (response.getStatusCode() == 200 || response.getStatusCode() == 202)
			return new ResponseEntity<>("send successfully", HttpStatus.OK);
		return new ResponseEntity<>("failed to sent", HttpStatus.NOT_FOUND);
	}
}
