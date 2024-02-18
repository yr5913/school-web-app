package com.yugeshreganti.school.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {

    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;
}
