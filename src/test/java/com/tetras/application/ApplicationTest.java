package com.tetras.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.tetras.librairie.GestionMachineACafe;
import com.tetras.librairie.MachineACafe;

import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testDependencyInjection() {
        MachineACafe machine = new MaMachineACafe();
        GestionMachineACafe gestionnaire = new GestionMachineACafe(machine);
        Application appli = new Application(gestionnaire);
        // Test
        assertNotNull(appli);
        assertNotNull(appli.getGestionnaire());
        assertNotNull(appli.getGestionnaire().getMachine());
    }
}