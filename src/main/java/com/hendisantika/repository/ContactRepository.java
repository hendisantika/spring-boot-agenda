package com.hendisantika.repository;

import com.hendisantika.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-agenda
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 10.35
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
