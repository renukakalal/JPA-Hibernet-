package com.xworkz.admin.service;


import com.xworkz.admin.Entity.AdminEntity;
import com.xworkz.admin.dto.AdminDTO;
import com.xworkz.admin.repository.AdminRepository;
import com.xworkz.admin.repository.AdminRepositoryImplementation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImplementation implements Adminservice {

    @Autowired

    private AdminRepository adminRepository;


    @Override
    public boolean save(AdminDTO adminDTO) {

        System.out.println("data in service"+adminDTO);

        if (adminDTO == null) {
            return false;
        }

        boolean isValid = true;
        if (adminDTO.getName() == null || !adminDTO.getName().matches("^[a-zA-Z\\s]{10,}$")) {
            System.out.println("Invalid name. It must be at least 10 characters and contain no special characters.");
            isValid = false;
        }
        if (adminDTO.getAge() <= 18) {
            System.out.println("Invalid age. Age must be greater than 18.");
            isValid = false;
        }
        if (adminDTO.getEmail() == null || !adminDTO.getEmail().matches("^[\\w.-]+@gmail\\.com$")) {
            System.out.println("Invalid email. It must be a valid Gmail address.");
            isValid = false;
        }
        if (adminDTO.getPassword() == null || !adminDTO.getPassword().matches("^(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{7,}$")) {
            System.out.println("Invalid password. It must be at least 7 characters long and contain at least 2 special characters.");
            isValid = false;
        }
        if (adminDTO.getConformpassword() == null || !adminDTO.getPassword().matches("^(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{7,}$")) {
            System.out.println("Invalid password. It must be at least 7 characters long and contain at least 2 special characters.");
            isValid = false;
        }

//        if (adminDTO != null) {
            AdminEntity adminEntity = new AdminEntity();
//            adminEntity.setId(adminDTO.getId());
//            adminEntity.setName(adminDTO.getName());
//            adminEntity.setAge(adminDTO.getAge());
//            adminEntity.setEmail(adminDTO.getEmail());
//            adminEntity.setPassword(adminDTO.getPassword());
//            adminEntity.setConformpassword(adminDTO.getConformpassword());
//            adminEntity.setPhonenumber(adminDTO.getPhonenumber());

        BeanUtils.copyProperties(adminDTO,adminEntity);

        System.out.println("Entity " + adminEntity);
            adminRepository.save(adminEntity);
            return true;
//        }
//
//        return isValid;
    }


}











