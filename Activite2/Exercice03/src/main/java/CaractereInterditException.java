/**
 * Classe des caracteres interdits.
 */

public class CaractereInterditException extends Exception {

/**
* Classe des caracteres interdits.
* @param message retouner par la methode
*/
public CaractereInterditException(final String message) {
super(message); // message est le message a retourner a l'utilisateur
}
}
