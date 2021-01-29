package Tableau;

import java.util.ArrayList;
import java.util.List;
import classe.Article;
import Interface.Inter;


public class Tableau implements Inter<Article> {

    private List<Article> articles;

    public Tableau() {
        articles = new ArrayList<>();
    }

    @Override
    public boolean create(Article o) {
        return articles.add(o);
    }

    @Override
    public boolean delete(Article o) {
        return articles.remove(o);
    }

    @Override
    public boolean update(Article o) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId() == o.getId()) {
                articles.set(i, o);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public Article findById(int id) {
        for (Article a : articles) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;

    }

}

