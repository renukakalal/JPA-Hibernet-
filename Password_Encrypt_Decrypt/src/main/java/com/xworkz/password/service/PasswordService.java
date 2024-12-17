package com.xworkz.password.service;

import com.xworkz.password.dto.PasswordDTO;
import com.xworkz.password.entity.PasswordEntity;

import java.util.List;

public interface PasswordService {

    boolean save(PasswordDTO passwordDTO);


}
