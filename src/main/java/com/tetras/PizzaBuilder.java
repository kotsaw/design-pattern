package com.tetras;

public class PizzaBuilder {

    private boolean emmental = false;

    private boolean cremeFraiche = false;

    private boolean lardons = false;

    private boolean sauceTomate = false;

    private boolean anchois = false;

    private boolean champignons = false;

    private boolean jambon = false;

    public void addJambon() {
        jambon = true;
    }

    public void addChampignons() {
        champignons = true;
    }

    public void addAnchois() {
        anchois = true;
    }

    public void addSauceTomate() {
        sauceTomate = true;
    }

    public void addLardons() {
        lardons = true;
    }

    public void addCremeFraiche() {
        cremeFraiche = true;
    }

    public void addEmmental() {
        emmental = true;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setAnchois(anchois);
        pizza.setChampignons(champignons);
        pizza.setCremeFraiche(cremeFraiche);
        pizza.setEmmental(emmental);
        pizza.setJambon(jambon);
        pizza.setLardons(lardons);
        pizza.setSauceTomate(sauceTomate);
        return pizza;
    }

}