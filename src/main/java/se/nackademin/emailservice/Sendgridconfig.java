package se.nackademin.emailservice;
import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Ashkan Amiri
 * Date:  2021-09-01
 * Time:  11:40
 * Project: emailService
 * Copyright: MIT
 */



@Configuration
public class Sendgridconfig {

	@Value("${sendgrid.key}")
	private String key;


	@Bean
	public SendGrid getSendgrid() {
		return new SendGrid(key);
	}

}