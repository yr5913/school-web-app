package com.yugeshreganti.school.service;

import com.yugeshreganti.school.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

    public void saveMessage(Contact contact) {
        log.info("Contact Information is: " + contact);
    }

}
