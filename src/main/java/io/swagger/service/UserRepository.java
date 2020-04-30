package io.swagger.service;

import io.swagger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

	  @Modifying

	  @Query("update User u set " + "u.username = ?1," + "u.email = ?2, " +
	  "u.firstName = ?3, " + "u.lastName = ?4, " + "u.password = ?5, " +
	  "u.phone = ?6, " + "u.userStatus = ?7, " + "u.kyu = ?8 " + "where u.username like ?1") //
	  void updateUserByName(String username, String
	  email, String firstName, String lastName, String password, String phone, int
	  userStatus, String kyu);

	Optional<User> findByUsername(String username);

}
