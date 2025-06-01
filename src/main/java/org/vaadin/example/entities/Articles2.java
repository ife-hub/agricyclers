package org.vaadin.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Articles2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long article2Id;

    private String author2;
    private String content2;

    public Long getArticle2Id() {
        return article2Id;
    }

    public void setArticle2Id(Long article2Id) {
        this.article2Id = article2Id;
    }

    public String getAuthor2() {
        return author2;
    }

    public void setAuthor2(String author2) {
        this.author2 = author2;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }
}
