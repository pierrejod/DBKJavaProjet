package Tableau;

import java.util.ArrayList;
import java.util.List;
import classe.Produit;
import Interface.Inter;


public class Tableau implements Inter<Produit> {

    private List<Produit> produits;

    public Tableau() {
        produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == o.getId()) {
                produits.set(i, o);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;

    }

}

