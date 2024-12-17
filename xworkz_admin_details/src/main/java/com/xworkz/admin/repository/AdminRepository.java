package com.xworkz.admin.repository;

import com.xworkz.admin.Entity.AdminEntity;
import com.xworkz.admin.service.Adminservice;

public interface AdminRepository {

    boolean save(AdminEntity entity);
}
