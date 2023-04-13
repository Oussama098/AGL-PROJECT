/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import entity.usager;
import java.sql.Date;
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
public class TestUser {
    
    public TestUser() {
    }
    
    private usager usager;

    @BeforeEach
    public void setUp() {
        // create a new usager object before each test
        usager = new usager("Doe", "John", Date.valueOf("2000-01-01"), "M", "123 Main St", "555-1234");
    }

    @Test
    public void testGetters() {
        assertEquals("Doe", usager.getNom());
        assertEquals("John", usager.getPrenom());
        assertEquals(Date.valueOf("2000-01-01"), usager.getDateNais());
        assertEquals("M", usager.getSexe());
        assertEquals("123 Main St", usager.getAdresse());
        assertEquals("555-1234", usager.getTel());
    }

    @Test
    public void testSetters() throws ErrorException {
        // test valid input
        usager.setId(1);
        assertEquals(1, usager.getId());

        usager.setNom("Smith");
        assertEquals("Smith", usager.getNom());

        usager.setPrenom("Jane");
        assertEquals("Jane", usager.getPrenom());

        usager.setDateNais(Date.valueOf("1990-01-01"));
        assertEquals(Date.valueOf("1990-01-01"), usager.getDateNais());

        usager.setSexe("F");
        assertEquals("F", usager.getSexe());

        usager.setAdresse("456 Maple St");
        assertEquals("456 Maple St", usager.getAdresse());

        usager.setTel("555-5678");
        assertEquals("555-5678", usager.getTel());

        // test invalid input
        assertThrows(ErrorException.class, () -> usager.setId(0));
        assertThrows(ErrorException.class, () -> usager.setNom("A"));
        assertThrows(ErrorException.class, () -> usager.setPrenom("B"));
        assertThrows(ErrorException.class, () -> usager.setSexe(null));
        assertThrows(ErrorException.class, () -> usager.setAdresse("C"));
        assertThrows(ErrorException.class, () -> usager.setTel("D"));
    }

    @Test
    public void testToString() {
        String expected = "Usager{id=0, nom=Doe, prenom=John, dateNais=2000-01-01, sexe=M, adresse=123 Main St, tel=555-1234}";
        assertEquals(expected, usager.toString());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
