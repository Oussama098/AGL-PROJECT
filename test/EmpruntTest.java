import entity.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import utility.ErrorException;

public class EmpruntTest {

    private emprunt emprunt;
    private usager usager;
    private oeuvre oeuvre;
    private Date dateEmprunt;
    private Date dateRetourPrevu;

    @Before
    public void setUp() throws Exception {
        usager = new usager(1, "John", "Doe", (java.sql.Date) new Date(),"M","lotissemet","0617057583");
        oeuvre = new oeuvre(1, "The Catcher in the Rye", "J.D. Salinger","F. Scott Fitzgerald","fiction");
        dateEmprunt = new Date();
        dateRetourPrevu = new Date(dateEmprunt.getTime() + (1000 * 60 * 60 * 24 * 7)); // one week after emprunt
        emprunt = new emprunt(1, usager, oeuvre, dateEmprunt, dateRetourPrevu);
    }

    @Test
    public void testGetId() {
        assertEquals(1, emprunt.getId());
    }

    @Test
    public void testSetId() throws ErrorException {
        emprunt.setId(2);
        assertEquals(2, emprunt.getId());
    }

    @Test(expected = ErrorException.class)
    public void testSetIdWithInvalidValue() throws ErrorException {
        emprunt.setId(-1);
    }

    @Test
    public void testGetDateEmprunt() {
        assertEquals(dateEmprunt, emprunt.getDateEmprunt());
    }

}
