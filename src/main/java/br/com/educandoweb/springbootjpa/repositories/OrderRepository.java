package br.com.educandoweb.springbootjpa.repositories;

import br.com.educandoweb.springbootjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
