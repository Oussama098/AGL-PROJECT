package utility;

import javax.swing.JOptionPane;

/**
 *
 * @author Diallo & Janati
 */
public class ErrorException extends Exception{

    public ErrorException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message, "Informations", JOptionPane.PLAIN_MESSAGE);
    }
    
    public ErrorException(Throwable cause) {
        super(cause);
    }
    
    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
