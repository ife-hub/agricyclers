package org.vaadin.example.services;

import org.springframework.stereotype.Service;
import org.vaadin.example.entities.Articles;
import org.vaadin.example.repositories.ArticleRepository;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Articles> getAllArticles()
    {
        return articleRepository.findAll();
    }

    public Articles getArticleById(Long articleId){
        return articleRepository.findById(articleId).get();
    }

    public Articles saveArticle(Articles article){
        return articleRepository.save(article);
    }

    public void deleteArticle(Articles article){
        articleRepository.delete(article);
    }
}
