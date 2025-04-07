package com.example.mailservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.mailservice.model.MailRequest;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendMail(MailRequest request) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(request.getTo());
		msg.setSubject(request.getSubject());
		msg.setText(request.getMessage());
		mailSender.send(msg);
	}

}
