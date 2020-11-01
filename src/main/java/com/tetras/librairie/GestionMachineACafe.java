package com.tetras.librairie;

import javax.inject.Inject;

public class GestionMachineACafe {

    @Inject
    private MachineACafe machine;

    public MachineACafe getMachine() {
        return machine;
    }

    public void setMachine(MachineACafe machine) {
        this.machine = machine;
    }

    public GestionMachineACafe() {
    }
}