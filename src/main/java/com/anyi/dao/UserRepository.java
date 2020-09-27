package com.anyi.dao;

import com.anyi.dto.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserInfo, Long> {

    UserInfo findByName(String nam);

    Optional<UserInfo> findById(Long id);
}
