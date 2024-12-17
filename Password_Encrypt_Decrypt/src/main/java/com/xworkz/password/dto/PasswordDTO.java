package com.xworkz.password.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@NoArgsConstructor

public class PasswordDTO {

    private int id;
    private String name;
    private String email;
    private String password;

}
