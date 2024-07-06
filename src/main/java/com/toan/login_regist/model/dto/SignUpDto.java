package com.toan.login_regist.model.dto;

import lombok.Data;

/** SignUpDto */
@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
