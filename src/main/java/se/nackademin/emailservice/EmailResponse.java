package se.nackademin.emailservice;

/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  15:08
 * Project: emailService
 * Copyright: MIT
 */
public class EmailResponse {
	private String message;

	public EmailResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
