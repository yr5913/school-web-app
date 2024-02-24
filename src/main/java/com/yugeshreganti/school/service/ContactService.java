package com.yugeshreganti.school.service;

import com.yugeshreganti.school.constants.EazySchoolConstants;
import com.yugeshreganti.school.model.Contact;
import com.yugeshreganti.school.repository.ContactRepository;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
//@RequestScope
//@SessionScope
@ApplicationScope
@Getter
@Setter
public class ContactService {

    private final ContactRepository contactRepository;


    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public boolean saveMessage(Contact contact) {
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        Contact savedContact = contactRepository.save(contact);
        if (savedContact.getContactId() > 0) {
            isSaved = true;
        }
        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        return contactRepository.findByStatus(EazySchoolConstants.OPEN);
    }

    public boolean updateMsgStatus(int contactId) {
        boolean isUpdated = false;

        Optional<Contact> contact = contactRepository.findById(contactId);
        contact.ifPresent(contact1 -> {
            contact1.setStatus(EazySchoolConstants.CLOSE);
        });
        if (contact.isEmpty()) {
            return isUpdated;
        }

        Contact savedContact = contactRepository.save(contact.get());
        if (savedContact.getContactId() > 0) {
            isUpdated = true;
        }
        return isUpdated;
    }


}
