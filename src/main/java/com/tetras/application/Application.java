package com.tetras.application;

import javax.inject.Inject;

import com.tetras.librairie.GestionMachineACafe;

public class Application {

    @Inject
    private GestionMachineACafe gestionnaire;

    public GestionMachineACafe getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(GestionMachineACafe gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    public Application() {
    }
}