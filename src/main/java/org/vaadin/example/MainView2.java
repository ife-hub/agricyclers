package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.vaadin.example.entities.Articles;
import org.vaadin.example.services.ArticleService;

import java.util.ArrayList;
import java.util.List;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route("mainView2")
public class MainView2 extends VerticalLayout {

    private final ArticleService articleService;
    //private List<Articles> getList = new ArrayList<>();
    private Grid<Articles> grid = new Grid<>();

    public MainView2(ArticleService articleService) {
        this.articleService = articleService;
        //getList = articleService.getAllArticles();

        TextField author = new TextField("Author");
        TextField content = new TextField("Content");
        TextField category = new TextField("Category");
        DatePicker date = new DatePicker("Date");
        TextField title = new TextField("Title");
        title.addClassName("tf");

        Button save = new Button("Save");
        save.addClickListener(event -> {
            Articles article = new Articles();
            article.setAuthor(author.getValue());
            article.setCategory(category.getValue());
            article.setContent(content.getValue());
            article.setDate(date.getValue());
            article.setTitle(title.getValue());
            articleService.saveArticle(article);
            //getList = articleService.getAllArticles();
            grid.setItems(getGetList());
        });

        grid = new Grid<>();
        grid.addColumn(Articles::getArticleId).setHeader("Article ID");
        grid.addColumn(Articles::getAuthor).setHeader("Article Author");
        grid.addColumn(Articles::getCategory).setHeader("Article Category");
        grid.addColumn(Articles::getContent).setHeader("Article Content");
        grid.addColumn(Articles::getDate).setHeader("Article Date");
        grid.addColumn(Articles::getTitle).setHeader("Article Title");

        grid.setItems(getGetList());

        add(author, category, content, date, title, save, grid);
    }

    public List<Articles> getGetList(){
        List<Articles> list = new ArrayList<>();
        list = articleService.getAllArticles();
        return list;
    }

}
