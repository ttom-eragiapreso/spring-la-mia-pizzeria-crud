package org.learning.lamiapizzeria.repository;

import org.learning.lamiapizzeria.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
