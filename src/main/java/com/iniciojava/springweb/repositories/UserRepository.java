package com.iniciojava.springweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iniciojava.springweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
