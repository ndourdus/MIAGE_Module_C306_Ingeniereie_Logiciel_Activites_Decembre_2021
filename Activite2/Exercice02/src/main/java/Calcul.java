/**
 * Une classe permettant d'effectuer certaines
 * operations de base sur les entiers.
 * @author Sebastien Choplin
 **/
public class Calcul {

  /**
   * Constructeur protected avec exception
   * pour empecher l'instantiation de la classe.
   * @throws Exception On ne peut instancier cette classe.
   * @author Ndourdom Ezechiel
   **/
protected Calcul() throws Exception {
throw new Exception("On ne peut instancier cette classe.");
}

  /**
   * Calcul de la somme de deux entiers.
   * @author Sebastien Choplin
   * @param a est un entier.
   * @param b est un entier.
   * @return retourne la somme de a + b.
   **/
  public static int somme(final int a, final int b) {
    return a + b;
  }

  /**
   * Fonction quotient a sur b.
   * @author Sebastien Choplin
   * @param a est un entier.
   * @param b est un entier.
   * @return retourne a/b si b est superieur
   *         ou egale a 10 et b dans le cas
   *         contraire.
   **/
  public static int maFonction(final int a, final int b) {
    final int bMin = 10;
    if (b >= bMin) {
      return a / b;
    }
    return b;
  }

  /**
   * Fonction division de deux entiers.
   * @author Sebastien Choplin
   * @param a est un entier.
   * @param b est un entier.
   * @return a / b si b != 0.
   * @throws IllegalArgumentException si b == 0
   **/
  public static int division(final int a, final int b) {
    if (b == 0) {
      throw new IllegalArgumentException("b ne doit pas etre 0");
    }
    return a / b;
  }
}
