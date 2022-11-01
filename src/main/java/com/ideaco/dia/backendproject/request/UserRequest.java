package com.ideaco.dia.backendproject.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserRequest {
    private String name;
    private int age;
    private String job;
    private String address;
    private String password;
    private String email;
    private String phone;
    private String resume;
    private Timestamp create_at;
    private Timestamp update_at;
    private Boolean status;
}
