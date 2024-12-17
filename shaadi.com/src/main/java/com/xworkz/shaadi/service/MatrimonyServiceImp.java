package com.xworkz.shaadi.service;

import com.xworkz.shaadi.dto.MatrimoneyDTO;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImp implements MatrimonoyService{
    @Override
    public boolean validate(MatrimoneyDTO matrimoneyDTO) {
        return true;
    }
}
