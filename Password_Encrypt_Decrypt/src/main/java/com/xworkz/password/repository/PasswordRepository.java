package com.xworkz.password.repository;

import com.xworkz.password.entity.PasswordEntity;

import java.util.List;

public interface PasswordRepository {

    boolean save(PasswordEntity passwordEntity);

}
