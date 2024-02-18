package com.yugeshreganti.school.service;

import com.yugeshreganti.school.model.Contact;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Slf4j
//@RequestScope
@SessionScope
@Getter
@Setter
public class ContactService {

    public ContactService() {
        System.out.println("Contact Service is created");
    }

    private int counter;

    public void saveMessage(Contact contact) {
        log.info("Contact Information is: " + contact);
    }


}
