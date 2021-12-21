package com.hendisantika.controller;

import com.hendisantika.model.Contact;
import com.hendisantika.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("new")
    public String showContactRegisterForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "new";
    }

    @PostMapping("new")
    public String saveNewContact(@Validated Contact contact, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("contact", contact);
            return "new";
        }

        contactRepository.save(contact);
        redirect.addFlashAttribute("msgExit", "The contact has been added successfully");
        return "redirect:/";
    }

}