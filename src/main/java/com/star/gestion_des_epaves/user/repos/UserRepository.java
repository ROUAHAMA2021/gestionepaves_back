package com.star.gestion_des_epaves.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.star.gestion_des_epaves.user.entities.User;

@Repository("userrepository")
public interface UserRepository extends JpaRepository<User, Long> {


}
