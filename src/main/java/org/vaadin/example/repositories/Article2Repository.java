package org.vaadin.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.entities.Articles2;

public interface Article2Repository extends JpaRepository<Articles2, Long> {
}
