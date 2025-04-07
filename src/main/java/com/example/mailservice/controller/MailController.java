package com.example.mailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailservice.model.MailRequest;
import com.example.mailservice.service.EmailService;

@RestController
@RequestMapping("/api/mail")
@CrossOrigin(origins = "*")
public class MailController {
	@Autowired
	private EmailService emailService;

	@PostMapping("/send")
	public String sendMail(@RequestBody MailRequest request) {
		emailService.sendMail(request);
		return "Mail sent!";
	}
}
