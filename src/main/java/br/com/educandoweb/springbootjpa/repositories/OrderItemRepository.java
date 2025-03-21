package br.com.educandoweb.springbootjpa.repositories;

import br.com.educandoweb.springbootjpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
