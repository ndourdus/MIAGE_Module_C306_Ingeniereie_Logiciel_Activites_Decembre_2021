import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Classe GrilleImplTest representant de
 * tester les methodes de la classe GrilleImpl.
 * @author Ndourdom Ezechiel
 *
 */
public class GrilleImplTest {
/**  Taille 4.  */
  static final int TAILLE_4 = 4;
  /**  Taille 4. 9.  */
  static final int TAILLE_9 = 9;
  /**  Taille 4. 16.  */
  static final int TAILLE_16 = 16;
  /**  Taille 4. 25.  */
  static final int TAILLE_25 = 25;
  /**  contante 4.  */
  static final int QUATRE = 4;
  /**  Constante 6.  */
  static final int SIX = 6;
  /**  Taille 4. vide.  */
  static final char EMPTY_CHAR = '@';
/**  Nombre de caractere possible.  */
  static final char[] POSSIBLE = new char[] {'1', '2', '3', '4', '5', '6',
    '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g',  'h',  'i',  'j',
    'k',  'l',  'm',  'n',  'o' };

/**  Tableau de dimension 4.  */
private char[][] grilleDeQuatre = new char[][] {
{'2', '3', '4', '1', },
{'4', '1', '2', '3', },
{'1', '4', '3', '2', },
{'3', '2', '1', '4', }};

/**  Tableau de dimension 9.  */
private char[][] grilleDeNeuf = new char[][] {
{'9', '1', '3', '6', '2', '7', '5', '8', '4'},
{'6', '4', '2', '5', '8', '9', '7', '3', '1'},
{'8', '7', '5', '3', '4', '1', '6', '9', '2'},
{'5', '8', '9', '1', '7', '4', '3', '2', '6'},
{'2', '6', '1', '8', '9', '3', '4', '5', '7'},
{'7', '3', '4', '2', '6', '5', '8', '1', '9'},
{'1', '2', '8', '7', '3', '6', '9', '4', '5'},
{'3', '9', '6', '4', '5', '2', '1', '7', '8'},
{'4', '5', '7', '9', '1', '8', '2', '6', '3'}};

/**  Tableau de dimension 16.  */
private char[][] grilleDeSeize = new char[][] {
{'8', 'f', '6', '5', '1', 'a', '7', 'd',
'4', '9', 'c', '3', '2', 'b', '0', 'e'},
{'1', '4', '2', '3', 'b', 'c', 'e', '9',
'0', '6', '8', 'd', '5', 'f', '7', 'a'},
{'c', '7', 'a', '9', '0', '4', '2', '3',
'b', 'e', 'f', '5', '6', 'd', '8', '1'},
{'b', '0', 'd', 'e', 'f', '5', '8', '6',
'7', 'a', '2', '1', '4', '3', 'c', '9'},
{'2', '6', '4', '7', 'd', '8', '9', 'b',
'c', '0', 'e', 'f', '3', 'a', '1', '5'},
{'3', '9', '5', '1', '6', '0', 'a', 'f',
'2', '8', 'b', '4', 'c', '7', 'e', 'd'},
{'f', 'd', '8', '0', 'c', '1', '3', 'e',
'5', '7', 'a', '9', 'b', '6', '4', '2'},
{'a', 'b', 'e', 'c', '2', '7', '5', '4',
'd', '3', '1', '6', '9', '0', 'f', '8'},
{'d', '5', '9', '4', 'e', '3', 'f', '8',
'1', 'c', '7', 'a', '0', '2', '6', 'b'},
{'7', '2', 'b', 'a', '9', '6', 'd', 'c',
'e', '4', '0', '8', 'f', '1', '5', '3'},
{'0', 'c', '3', 'f', '4', 'b', '1', 'a',
'6', '5', 'd', '2', 'e', '8', '9', '7'},
{'6', 'e', '1', '8', '5', '2', '0', '7',
'9', 'f', '3', 'b', 'd', 'c', 'a', '4'},
{'e', '1', '7', '6', '3', 'f', '4', '2',
'a', 'd', '9', 'c', '8', '5', 'b', '0'},
{'9', '8', '0', '2', 'a', 'd', '6', '5',
'f', 'b', '4', '7', '1', 'e', '3', 'c'},
{'5', 'a', 'c', 'd', '8', '9', 'b', '0',
'3', '1', '6', 'e', '7', '4', '2', 'f'},
{'4', '3', 'f', 'b', '7', 'e', 'c', '1',
'8', '2', '5', '0', 'a', '9', 'd', '6'}};

/**  Test constructeur tableau de taille 4.  */
  @Test
   public void testConstructeurQuatre() {
     GrilleImpl test = new GrilleImpl(TAILLE_4);
     assertEquals(TAILLE_4, test.getDimension());
     assertEquals(EMPTY_CHAR, test.getGrille()[0][0]);
   }

  /**  Test constructeur tableau de taille 9.  */
  @Test
  public void testConstructeurNeuf() {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    assertEquals(TAILLE_9, test.getDimension());
    assertEquals(EMPTY_CHAR, test.getGrille()[0][0]);
  }

/**  Test constructeur tableau de taille 16.  */
  @Test
  public void testConstructeurSeize() {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    assertEquals(TAILLE_16, test.getDimension());
    assertEquals(EMPTY_CHAR, test.getGrille()[0][0]);
  }

/**  Test constructeur tableau de taille 25.  */
  @Test
  public void testConstructeurVingtEtCinq() {
    GrilleImpl test = new GrilleImpl(TAILLE_25);
    assertEquals(TAILLE_25, test.getDimension());
    assertEquals(EMPTY_CHAR, test.getGrille()[0][0]);
  }

/**  Test setGrille de taille 4.  */
  @Test
  public void testGrilleQuatreSetValue() throws CaractereInterditException,
  HorsBornesException, ValeurImpossibleException {
    GrilleImpl test = new GrilleImpl(TAILLE_4);
    test.setValue(0, 0, '1');
  }

  /**  Test setGrille de taille 9.  */
  @Test
  public void testGrilleNeufSetValue() throws CaractereInterditException,
  HorsBornesException, ValeurImpossibleException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    test.setValue(0, 0, '1');
  }

  /**  Test setGrille de taille 16.  */
  @Test
  public void testGrilleSeizeSetValue() throws CaractereInterditException,
  HorsBornesException, ValeurImpossibleException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    test.setValue(0, 0, '0');
  }

  /**  Test setGrille de taille 25.  */
  @Test
  public void testGrilleVingtEtCinqSetValue() throws CaractereInterditException,
  HorsBornesException, ValeurImpossibleException {
    GrilleImpl test = new GrilleImpl(TAILLE_25);
    test.setValue(0, 0, '1');
  }

  /**  Test setX grille de taille 4.  */
  @Test
  public void testGrilleSetValueXHorsBorne() throws CaractereInterditException,
  HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_4);
    try {
      test.setValue(TAILLE_4, 0, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

  /**  Test setY grille de taille 9.  */
  @Test
  public void testGrilleSetValueYHorsBorne() throws HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    try {
      test.setValue(0, TAILLE_9, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

  /**  Test setX grille de taille16.  */
  @Test
  public void testGrilleSetValueXHorsBorne2() throws HorsBornesException,
  CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(-1, 0, '1');
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setY grille de taille 16.  */
  @Test
  public void testGrilleSetValueYHorsBorne2() throws HorsBornesException,
  ValeurImpossibleException, CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(0, -1, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setCaractere grille de taille 9.  */
  @Test
  public void testGrilleNeufSetValueCaractereNonAutorise()
    throws CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    try {
      test.setValue(0, 0, '0');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setCaractere grille de taille 16.  */
  @Test
  public void testGrilleSeizeSetValueCaractereNonAutorise()
throws CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(0, 0, 'w');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setValeur grille de taille 9.  */
  @Test
  public void testGrilleSetValeurImpossible()
throws ValeurImpossibleException,
  CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    try {
      test.setValue(0, 0, 'y');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (Exception e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setValeurPresente grille de taille 9.  */
  @Test
  public void testGrilleSetValueValeurDejaAjouteePresentSurLigne()
throws CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    try {
      test.setValue(0, 0, '1');
      test.setValue(0, 1, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setValeurPresente grille de taille 16.  */
  @Test
  public void testGrilleSetValueValeurDejaAjouteePresentSurColonne()
throws CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(0, 0, '1');
      test.setValue(1, 0, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test setValeurPresente grille de taille 16.  */
  @Test
  public void testGrilleSetValueValeurDejaAjouteePresentSurBloc()
throws CaractereInterditException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(0, 0, '1');
      test.setValue(1, 1, '1');
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (CaractereInterditException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test getValue grille de taille 9.  */
  @Test
  public void testGrilleNeufGetValue() throws CaractereInterditException,
  HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    test.setValue(0, 0, '1');
    assertEquals('1', test.getValue(0, 0));
  }

/**  Test getValue grille de taille 16.  */
  @Test
  public void testGrilleSeizeGetValue() throws ValeurImpossibleException,
  CaractereInterditException, HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    test.setValue(0, 0, '0');
    assertEquals('0', test.getValue(0, 0));
  }

/**  Test getValue grille de taille 9.  */
  @Test
  public void testGrilleNeufGetValueHorsBornes()
throws CaractereInterditException,
  HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    try {
      test.setValue(0, 0, '1');
      assertEquals('0', test.getValue(0, TAILLE_9));
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (HorsBornesException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test getValue grille de taille 16.  */
  @Test
  public void testGrilleSeizeGetValueHorsBornes()
throws CaractereInterditException,
  HorsBornesException {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    try {
      test.setValue(0, 0, '1');
      assertEquals('0', test.getValue(0, TAILLE_16));
     fail("Reaction annormale, une exception a ete ignoree.");
    } catch (HorsBornesException e) {
      System.out.println("C'est normal de se retrouver ici car : \""
    + e.getMessage() + "\"");
    }
  }

/**  Test getValue grillecomplete  de taille 4.  */
  @Test
  public void testGrilleDeQuatreComplete() {
    GrilleImpl test = new GrilleImpl(TAILLE_4);
    test.setGrille(grilleDeQuatre);
    assertEquals(true, test.complete());
  }

/**  Test getValue grille complete de taille 9.  */
  @Test
  public void testGrilleNeufComplete() {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    test.setGrille(grilleDeNeuf);
    assertEquals(true, test.complete());
  }

 /**  Test getValue grille complete de taille 16.  */
  @Test
  public void testGrilleSeizeComplete() {
    GrilleImpl test = new GrilleImpl(TAILLE_16);
    test.setGrille(grilleDeSeize);
    assertEquals(true, test.complete());
  }

/**  Test getValue grille incomplete de taille 4.  */
  @Test
  public void testGrilleDeQuatreIncomplete() {
    GrilleImpl test = new GrilleImpl(TAILLE_4);
    grilleDeNeuf[0][1] = EMPTY_CHAR;
    test.setGrille(grilleDeNeuf);
    assertEquals(false, test.complete());
  }

/**  Test getValue grille incompltede taille 9.  */
  @Test
  public void testGrilleNeufIncomplete() {
    GrilleImpl test = new GrilleImpl(TAILLE_9);
    grilleDeNeuf[0][1] = EMPTY_CHAR;
    test.setGrille(grilleDeNeuf);
    assertEquals(false, test.complete());
  }

/**  Test getValue grille incomplete de taille 16.  */
  @Test
  public void testGrilleSeizeIncomplete() {

    GrilleImpl test = new GrilleImpl(TAILLE_16);
    grilleDeSeize[QUATRE][SIX] = EMPTY_CHAR;
    test.setGrille(grilleDeSeize);
    assertEquals(false, test.complete());
  }

}
