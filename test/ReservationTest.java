import entity.*;
import utility.ErrorException;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ReservationTest {

    @Test
    public void testReservationId() throws ErrorException {
        reservation res = new reservation(1, new usager(), new oeuvre(), new Date(), null);
        res.setId(2);
        assertEquals(2, res.getId());
    }

    @Test(expected = ErrorException.class)
    public void testReservationInvalidId() throws ErrorException {
        reservation res = new reservation(-1, new usager(), new oeuvre(), new Date(), null);
    }

    @Test
    public void testReservationDates() throws ErrorException {
        Date reservationDate = new Date();
        Date annulationDate = new Date();
        reservation res = new reservation(1, new usager(), new oeuvre(), reservationDate, annulationDate);
        assertEquals(reservationDate, res.getDateReservation());
        assertEquals(annulationDate, res.getDateAnnulation());

        Date newReservationDate = new Date();
        res.setDateReservation(newReservationDate);
        assertEquals(newReservationDate, res.getDateReservation());

        Date newAnnulationDate = new Date();
        res.setDateAnnulation(newAnnulationDate);
        assertEquals(newAnnulationDate, res.getDateAnnulation());
    }

    @Test
    public void testReservationUsager() throws ErrorException {
        usager usager = new usager();
        reservation res = new reservation(1, usager, new oeuvre(), new Date(), null);
        assertEquals(usager, res.getUsagerReservation());

        usager newUsager = new usager();
        res.setUsagerReservation(newUsager);
        assertEquals(newUsager, res.getUsagerReservation());
    }

    @Test
    public void testReservationOeuvre() throws ErrorException {
        oeuvre oeuvre = new oeuvre();
        reservation res = new reservation(1, new usager(), oeuvre, new Date(), null);
        assertEquals(oeuvre, res.getOeuvresReservation());

        oeuvre newOeuvre = new oeuvre();
        res.setOeuvresReservation(newOeuvre);
        assertEquals(newOeuvre, res.getOeuvresReservation());
    }

}
