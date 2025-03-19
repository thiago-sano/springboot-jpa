package br.com.educandoweb.springbootjpa.repositories;

import br.com.educandoweb.springbootjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
