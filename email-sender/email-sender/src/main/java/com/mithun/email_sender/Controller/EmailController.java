package com.mithun.email_sender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mithun.email_sender.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailController {
	 @Autowired
	    private EmailService emailService;

	    @GetMapping("/send")
	    public String sendEmail() {

	        emailService.sendEmail(
	                "yourEmail@gmail.com",
	                "Spring Boot Email Test",
	                "Hello Mithun! Email sent from Spring Boot running locally-testing 1"
	        );

	        return "Email Sent Successfully";
	    }
}
