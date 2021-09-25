import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/** Tests unitaire pour la classe Calcul. **/
public class CalculTest {

/**  Constant entier VAL1. */
private  static  final  int  VAL1 = 2;

/**  Constant entier VAL2. */
private  static  final  int  VAL2 = 3;

/**  Constant entier VAL3. */
private  static  final  int  VAL3 = 4;

/**  Constant entier VAL4. */
private  static  final  int  VAL4 = 8;

/**  Constant entier VAL5. */
private  static  final  int  VAL5 = 16;

/**  Constant entier VAL6. */
private  static  final  int  VAL6 = 32;

/**  Constant entier VAL7. */
private  static  final  int  VAL7 = 160;

/**  Constant entier VAL8. */
private  static  final  int  VAL8 = 10;

/**  Constant entier somme VAL1 + VAL2. */
private  static  final  int  SOMME = 5;

/**
* Test constructeur de la classe Calcul.
*/
 @Test
 public void testConstructeur() {
  try {
   new Calcul();
   fail("Reaction annormale car une exception est ignoree.");
  } catch (Exception e) {
 System.out.println("C'est normal d'etre ici car :\"" + e.getMessage() + "\"");
  }
 }

 /**
 * Test somme de deux entiers a et b.
 */
 @Test
 public void testSomme() {
  assertEquals(SOMME, Calcul.somme(VAL1, VAL2));
 }

 /**
 * Test division de deux entiers a/b avec b>0.
 */
 @Test
 public void testDivision() {
  assertEquals(VAL3, Calcul.division(VAL4, VAL1));
 }

 /**
 * Test division par zero.
 */
 @Test
 public void testDivisionFail() {
 try {
   Calcul.division(VAL1, 0);
   fail("Reaction annormale car une exception est ignoree.");
  } catch (IllegalArgumentException e) {
   System.out.println("C'est normal d'etre ici car : \""
  + e.getMessage() + "\"");
  }
 }

/** Test MaFonction avec b < 10. **/
 @Test
 public void testMaFonctionMin() {
  assertEquals(VAL3, Calcul.maFonction(VAL1, VAL3));
 }

 /** Test MaFonction avec b >= 10. **/
 @Test
 public void testMaFonctionMax() {
  assertEquals(VAL1, Calcul.maFonction(VAL6, VAL5));
 }
 /** Test MaFonction avec b = 10. **/
 @Test
 public void testMaFonction() {
  assertEquals(VAL5, Calcul.maFonction(VAL7, VAL8));
 }
}
