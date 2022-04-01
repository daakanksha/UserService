package com.test.usersservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.usersservice.model.Users;


@Repository
@Transactional
public interface UsersDao extends JpaRepository<Users,String>{

}
