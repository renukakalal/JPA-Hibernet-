package com.xworkz.shaadi.service;

import com.xworkz.shaadi.dto.DeathCerificateDTO;
import org.springframework.stereotype.Service;


public interface DeathCertificateService {

    boolean validate(DeathCerificateDTO deathCerificateDTO);
}
