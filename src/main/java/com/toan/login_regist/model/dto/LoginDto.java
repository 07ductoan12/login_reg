package com.toan.login_regist.model.dto;

import lombok.Data;

/** LoginDto */
@Data
public class LoginDto {

    private String usernameOrEmail;
    private String password;
}
