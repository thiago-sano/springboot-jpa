package br.com.educandoweb.springbootjpa.repositories;

import br.com.educandoweb.springbootjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
