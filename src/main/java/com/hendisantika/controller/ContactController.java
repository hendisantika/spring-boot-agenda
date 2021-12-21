package com.hendisantika.controller;

import com.hendisantika.model.Contact;
import com.hendisantika.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-agenda
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 10.45
 */
@Controller
@RequestMapping("/")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public String index(Model model) {
        List<Contact> contacts = contactRepository.findAll();
        model.addAttribute("contacts", contacts);
        return "index";
    }

    @GetMapping("/new")
    public String showContactRegisterForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "new";
    }
}
