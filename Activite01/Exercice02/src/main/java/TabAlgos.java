package activite.exercice02;

/**
 * Dans cette classe, nous allons implementer des algorithmes
 * sur un tableau d'entiers.
 * @author NDOURDOM Ezechiel
 */
public final class TabAlgos {
  /**
   * Constructeur protected avec exception
   * pour empecher l'instantiation de la classe.
   * @throws Exception On ne peut instancier cette classe.
   */
  protected TabAlgos() throws Exception {
    throw new Exception("On ne peut instancier cette classe");
  }

  /**
   * Trouver valeur Max d'un tableau.
   * @param tab est un tableau d'entier.
   * @return la plus grande valeur d'un tableau.
   * @throw IllegalArgumentException si tab et null ou vide.
   */
  public static int plusGrand(final int[] tab) {
    //Cas d'un tableau null
    if (tab == null) {
      throw new IllegalArgumentException("Le tableau ne peut etre null.");
    }

    //Cas d'un tableau vide c'est a dire de taille null.
    if (tab.length == 0) {
      throw new IllegalArgumentException("Le tableau ne peut etre null.");
    }

    //on affecte la plus petite valeur entiere possible a notre variable.
    int maxValue = Integer.MIN_VALUE;

    //Si une valeur superieur a maxValue
    //est trouvee lors du parcours de tableau,
    //alors maxValue prend cette valeur.
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > maxValue) {
    maxValue = tab[i];
      }
    }
    return maxValue;
  }

  /**
   * Retourne la moyenne du tableau.
   * @param tab est un tableau d'entier.
   * @return moyenne des valeurs du tableau.
   * @throw IllegalArgumentException si tab et null ou vide.
   **/
  public static double moyenne(final int[] tab) {
double somme = 0.0;

//Cas d'un tableau null
if (tab == null) {
throw new IllegalArgumentException("Le tableau ne peut etre null.");
}

//Cas d'un tableau vide c'est a dire de taille null.
if (tab.length == 0) {
throw new IllegalArgumentException("Le tableau ne peut etre null.");
}

for (int i = 0; i < tab.length; i++) {
//on procede a la somme des elements du tableau.
somme += tab[i];
}
 return (somme / tab.length);
}

/**
  * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
   * @param tab1 est un tableau d'entiers.
   * @param tab2 est un tableau d'entiers.
   * @return true si les 2 tableaux contiennent les memes elements
   *         avec les memes nombres d'occurences
   *         (avec les elements dans le meme ordre).
   **/
public static boolean egaux(final int[] tab1, final int[] tab2) {

//Si les deux tableaux sont de meme taille
if (tab1.length == tab2.length) {
for (int i = 0; i < tab1.length; i++) {

//Si deux elements de meme index sont differents
//alors les tableaux ne sont pas egaux.
if (tab1[i] != tab2[i]) {
return false;
}
}
return true;
} else {
//si les deux tabeaux n'ont pas la meme taille.
return false;
}
}

  /**
   * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
   * @param tab1 est un tableau d'entiers.
   * @param tab2 est un tableau d'entiers.
   * @return true si les 2 tableaux contiennent les memes elements
   *         avec les memes nombres d'occurrence
   *         (pas forcement dans le meme ordre).
   **/
public static boolean similaires(final int[] tab1, final int[] tab2) {
    //si les tableaux sont de la meme taille
if (tab1.length == tab2.length) {
int[] tmp1 = triBulles(tab1);
int[] tmp2 = triBulles(tab2);
return egaux(tmp1, tmp2);
} else {
//si les deux tabeaux ne sont pas de meme taille.
return false;
}
}

/**
   * Trie et arrange les elemets entiers d'un tableau par ordre croissant.
   * @param tab est un tableau d'entier.
   * @return un tableau trie par ordre croissant.
   **/
 private static int[] triBulles(final int[] tab) {
int tmp;
for (int i = tab.length - 1; i >= 1; i--) {
for (int j = 0; j < i; j++) {
if (tab[j] > tab[j + 1]) {
tmp = tab[j + 1];
tab[j + 1] = tab[j];
tab[ j ] = tmp;
}
}
}
return tab;
}
}
