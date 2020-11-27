package com.tetras;

public class Pizza {

    protected Pizza() {

    }

    private boolean emmental = false;

    private boolean cremeFraiche = false;

    private boolean lardons = false;

    private boolean sauceTomate = false;

    private boolean anchois = false;

    private boolean champignons = false;

    private boolean jambon = false;

    public boolean isEmmental() {
        return emmental;
    }

    public boolean isJambon() {
        return jambon;
    }

    public void setJambon(boolean jambon) {
        this.jambon = jambon;
    }

    public boolean isChampignons() {
        return champignons;
    }

    public void setChampignons(boolean champignons) {
        this.champignons = champignons;
    }

    public boolean isAnchois() {
        return anchois;
    }

    public void setAnchois(boolean anchois) {
        this.anchois = anchois;
    }

    public boolean isSauceTomate() {
        return sauceTomate;
    }

    public void setSauceTomate(boolean sauceTomate) {
        this.sauceTomate = sauceTomate;
    }

    public boolean isLardons() {
        return lardons;
    }

    public void setLardons(boolean lardons) {
        this.lardons = lardons;
    }

    public boolean isCremeFraiche() {
        return cremeFraiche;
    }

    public void setCremeFraiche(boolean cremeFraiche) {
        this.cremeFraiche = cremeFraiche;
    }

    public void setEmmental(boolean emmental) {
        this.emmental = emmental;
    }

}