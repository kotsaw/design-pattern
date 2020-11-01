package com.tetras.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import com.tetras.librairie.GestionMachineACafe;

import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;

@EnableWeld
public class ApplicationTest {

    @WeldSetup
    public WeldInitiator weld = WeldInitiator.of(Application.class, GestionMachineACafe.class, MaMachineACafe.class);

    @Inject
    Application appli;

    @Test
    public void testDependencyInjection() {
        // Test
        assertNotNull(appli);
        assertNotNull(appli.getGestionnaire());
        assertNotNull(appli.getGestionnaire().getMachine());
    }
}