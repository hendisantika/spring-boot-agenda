package com.hendisantika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-agenda
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 10.33
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "You must enter your name")
    private String fullName;

    @NotEmpty(message = "You must enter your email")
    @Email
    private String email;

    @NotBlank(message = "You must enter your phoneNumber")
    private String phoneNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past
    @NotNull(message = "You must enter your date of birth")
    private LocalDate birthDate;

    private LocalDateTime registrationDate = LocalDateTime.now();
}
