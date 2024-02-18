package com.yugeshreganti.school.service;

import com.yugeshreganti.school.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private static Logger log = LoggerFactory.getLogger(ContactService.class);

    public void saveMessage(Contact contact) {
        log.info("Contact Information is: " + contact);
    }

}
