package com.mercadopreso.api.repository;

import com.mercadopreso.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // .findAll() -> SELECT * FROM tb_users
    // .findById(1) -> SELECT * FROM tb_users WHERE id = 1
    // .save(user) -> INSERT ou UPDATE
    // .delete(user) -> DELETE
}
