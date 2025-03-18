package br.com.educandoweb.springbootjpa.repositories;

import br.com.educandoweb.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
