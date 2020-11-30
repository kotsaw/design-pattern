/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tetras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    void testCreatePizza() {
        // Reine : champignons, emmental, sauce tomate, jambon
        Pizza maPizza = new Pizza();

        assertFalse(maPizza.isAnchois());
        assertTrue(maPizza.isChampignons());
        assertFalse(maPizza.isCremeFraiche());
        assertTrue(maPizza.isEmmental());
        assertTrue(maPizza.isJambon());
        assertFalse(maPizza.isLardons());
        assertTrue(maPizza.isSauceTomate());
    }
}
