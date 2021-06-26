package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.avanade.dio.api.model.UserModel;

@Component
public interface UserRepository extends CrudRepository<UserModel, String> {

}
