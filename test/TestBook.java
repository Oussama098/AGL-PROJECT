/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import entity.oeuvre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class TestBook {
    
    @Test
    public void testSetId() throws ErrorException {
        oeuvre o = new oeuvre();
        o.setId(1);
        assertEquals(1, o.getId());
    }
    @Test(expected = ErrorException.class)
    public void testSetIdInvalid() throws ErrorException {
        oeuvre o = new oeuvre();
        o.setId(0);
    }

    @Test
    public void testSetCategorie() throws ErrorException {
        oeuvre o = new oeuvre();
        o.setCategorie("Roman");
        assertEquals("Roman", o.getCategorie());
    }

    @Test(expected = ErrorException.class)
    public void testSetCategorieInvalid() throws ErrorException {
        oeuvre o = new oeuvre();
        o.setCategorie("A");
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
