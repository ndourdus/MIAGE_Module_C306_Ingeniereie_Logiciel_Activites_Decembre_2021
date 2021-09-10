package activite.exercice02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Nous allons implementer des tests unitaires dans cette classe.
 * Ils nous permettront de tester les methodes ecrites dans la classe TabAlgos.
 * @author NDOURDOM Ezechiel
 */

public class TestTabAlgos {

  /**
   * Tableau Numero 01.
   */
  private final int[] tab1 = {1, 2, 3, 4, 5};

  /**
   * Tableau Numero 02.
   */
  private final int[] tab2 = {2, 3, 4, 5, 6};

  /**
   * Tableau Numero 03.
   */
  private final int[] tab3 = {5, 3, 2, 1, 4};

  /**
   * Tableau Numero 04.
   */
  private final int[] tab4 = {3, 4, 5, 6, 7, 8};

  /**
   * Tableau Numero 05.
   */
  private final int[] tab5 = {1, 2, 3, 4, 5};
  /**
   * Tableau null.
   */
  private final int[] tabNull = null;

  /**
   * Tableau vide.
   */
  private final int[] tabVide = new int[0];

  /**
   * Constante ayant pour valeur 0,1.
   */
  private final double dec = 0.1;

  /**
   * Constante ayant pour valeur 8.
   */
  private final int max = 8;

  /**
   * Constante ayant pour valeur 4.0.
   */
  private final double moyenne = 4.0;

  /**
   * Test pour la methode plusGrand. Cas nominal
   */
  @Test
  public void testPlusGrand() {
 assertEquals(max, TabAlgos.plusGrand(tab4));
  }


  /**
   * Test de la methode plusGrand avec tableau vide.
   */
  @Test
  public void testPlusGrandAvecParamVide() {
    try {
      TabAlgos.plusGrand(tabVide);
      fail("l'exception pour les tableaux vides aurait du etre levee.");
    } catch (IllegalArgumentException e) {
      // rien a faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la methode plusGrand avec tableau vide.
   */
  @Test
  public void testPlusGrandAvecParamNull() {
    try {
      TabAlgos.plusGrand(tabNull);
      fail("l'exception pour les tableaux nulls aurait du etre levee.");
    } catch (IllegalArgumentException e) {
      // rien a faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la methode moyenne cas nominal.
   */
  @Test
  public void testMoyenne() {
    assertEquals(moyenne, TabAlgos.moyenne(tab2), dec);
  }

  /**
   * Test de la methode moyenne avec tableau vide.
   */
  @Test
  public void testMoyenneAvecParamVide() {
    try {
      TabAlgos.moyenne(tabVide);
      fail("l'exception pour les tableaux vides "
          + "nulls aurait du etre levee.");
    } catch (IllegalArgumentException e) {
      // rien a faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la methode moyenne avec tableau null ou vide.
   */
  @Test
  public void testMoyenneAvecParamNull() {
    try {
      TabAlgos.moyenne(tabNull);
      fail("l'exception pour les tableaux vides "
          + "et nulls aurait du etre levee.");
    } catch (IllegalArgumentException e) {
      // rien a faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test pour la methode egaux. Cas nominal
   */
  @Test
  public void testEgaux() {
    assertEquals(true, TabAlgos.egaux(tab1, tab5));
  }

  /**
   * Test pour la methode egaux: tableaux de meme
   * taille avec des differences de valeurs.
   */
  @Test
  public void testEgauxAvecDifferentesValeurs() {
    assertEquals(false, TabAlgos.egaux(tab1, tab2));
  }

  /**
   * Test pour la methode egaux: tableaux de
   * taille differentes.
   */
  @Test
  public void testEgauxAvecTaillesDifferentes() {
    assertEquals(false, TabAlgos.egaux(tab3, tab4));
  }

  /**
   * Test pour la methode similaires. Cas nominal
   */
  @Test
  public void testSimilaires() {
    assertEquals(true, TabAlgos.similaires(tab1, tab3));
  }

  /**
   * Test pour la methode similaires:
   * tableaux de meme taille avec differences de valeurs.
   */
  @Test
  public void testSimilairesAvecDifferentesValeurs() {
    assertEquals(true, TabAlgos.similaires(tab1, tab3));
  }

  /**
   * Test pour la methode similaires: tableaux de
   * taille differentes.
   */
  @Test
  public void testSimilairesAvecTaillesDifferentes() {
    assertEquals(false, TabAlgos.similaires(tab1, tab4));
  }

}
