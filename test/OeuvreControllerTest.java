import dao.oeuvreController;
import entity.oeuvre;
import utility.ErrorException;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OeuvreControllerTest  {

    private oeuvreController controller;
    private oeuvre testOeuvre;

    @Before
    public void setUp() throws Exception {
        controller = new oeuvreController();
        testOeuvre = new oeuvre("9782070368228", "L'Écume des jours", "Boris Vian", "Roman");
    }

    @After
    public void tearDown() throws Exception {
        controller.supprimer(testOeuvre);
        controller = null;
        testOeuvre = null;
    }

    @Test
    public void testGetAll() {
        ArrayList<oeuvre> oeuvres = controller.getAll();
        assertNotNull(oeuvres);
        assertTrue(oeuvres.size() > 0);
    }

    @Test
    public void testAdd() {
        controller.add(testOeuvre);
        oeuvre result = controller.findByTitre(testOeuvre.getTitre());
        assertNotNull(result);
        assertEquals(testOeuvre.getTitre(), result.getTitre());
    }

    @Test
    public void testModifier() throws ErrorException{
        controller.add(testOeuvre);
        oeuvre result = controller.findByTitre(testOeuvre.getTitre());
        assertNotNull(result);
        assertEquals(testOeuvre.getTitre(), result.getTitre());

        String newTitre = "L'Arrache-cœur";
        testOeuvre.setTitre(newTitre);
        controller.modifier(testOeuvre);

        result = controller.findByTitre(newTitre);
        assertNotNull(result);
        assertEquals(newTitre, result.getTitre());
    }

    @Test
    public void testSupprimer() {
        controller.add(testOeuvre);
        oeuvre result = controller.findByTitre(testOeuvre.getTitre());
        assertNotNull(result);
        assertEquals(testOeuvre.getTitre(), result.getTitre());

        controller.supprimer(testOeuvre);
        result = controller.findByTitre(testOeuvre.getTitre());
        assertNull(result);
    }

    @Test
    public void testFindById() {
        controller.add(testOeuvre);
        oeuvre result = controller.findByTitre(testOeuvre.getTitre());
        assertNotNull(result);
        assertEquals(testOeuvre.getTitre(), result.getTitre());

        oeuvre resultById = controller.findById(result.getId());
        assertNotNull(resultById);
        assertEquals(result.getTitre(), resultById.getTitre());
    }

    @Test
    public void testFindByTitre() {
        controller.add(testOeuvre);
        oeuvre result = controller.findByTitre(testOeuvre.getTitre());
        assertNotNull(result);
        assertEquals(testOeuvre.getTitre(), result.getTitre());
    }

}
