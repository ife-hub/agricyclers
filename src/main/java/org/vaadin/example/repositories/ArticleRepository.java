package org.vaadin.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.entities.Articles;

public interface ArticleRepository extends JpaRepository<Articles, Long> {
}
