package com.prechile.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {

    public String firstname;
    public String lastname;
    public String email;
    public String userName;
    public String passWord;
    public String phone;
}
