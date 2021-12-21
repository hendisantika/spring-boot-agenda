package com.hendisantika.controller;

import com.hendisantika.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
