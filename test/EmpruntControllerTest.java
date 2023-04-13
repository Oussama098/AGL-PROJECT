import dao.empruntController;
import entity.oeuvre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import utility.ErrorException;

public class EmpruntControllerTest {

    private empruntController empruntCtrl = new empruntController();

    @Test
    void emprunterTest() {
        assertThrows(ErrorException.class, () -> empruntCtrl.emprunter(-1, 1));
        assertThrows(ErrorException.class, () -> empruntCtrl.emprunter(1, -1));
    }

    @Test
    void deleteTest() {
        oeuvre oeuvre = new oeuvre(1, "Le Petit Prince", "Antoine de Saint-Exupéry","F. Scott Fitzgerald","fiction");
        assertDoesNotThrow(() -> empruntCtrl.delete(oeuvre));
    }

    @Test
    void findEmpruntsTest() {
        oeuvre oeuvre = new oeuvre(1, "Le Petit Prince", "Antoine de Saint-Exupéry","F. Scott Fitzgerald","fiction");
        assertEquals(0, empruntCtrl.findEmprunts(oeuvre).size());
    }
}
