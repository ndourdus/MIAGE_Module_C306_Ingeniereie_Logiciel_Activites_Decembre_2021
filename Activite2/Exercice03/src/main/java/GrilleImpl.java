/**
 *  Implementation de la classe "GrilleImpl"
 *  pour la creation d'une simple grille de sudoku
 * de dimension 4x4, 9x9, 16x16 ou 25x25.
 * @author NDOURDOM Ezechiel.
 */

public class GrilleImpl implements Grille {


/**
   * Constante representant la dimenssion de la grille.
   */
  private final int dimension;

  /**
   * Grille de sudoku.
   */
  private char[][] grille;

  /**
   * Constructeur d'initialisation de
   * la grille de sudokou 4x4, 9x9, 16x16 ou 25x25.
   * @param taille de la grille de type int.
   */
  public GrilleImpl(final int taille) {
    this.dimension = taille;
    this.grille = new char[this.getDimension()][this.getDimension()];
    for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {
        this.grille[i][j] = EMPTY;
      }
    }
  }

  /**
   * Accesseur de retour de la grille.
   * @return char [][]
   */
  final char[][] getGrille() {
    return grille;
  }

  /**
   * mutateur d'affection d'une grille entiere.
   * @param newGrille la grille a affecter.
   */
  final void setGrille(final char[][] newGrille) {
    System.arraycopy(newGrille, 0, this.grille, 0, this.getDimension());
  }

  @Override
public final int getDimension() {
    return this.dimension;
  }

  @Override
  public final void setValue(final int x, final int y, final char value)
      throws CaractereInterditException {
    try {
      this.possible(x, y, value);
      //Si la value n'est pas autorisee dans
      //la grille aux vues des autres valeurs
      //contenues dans le tableau, on leve une
      //exception.
      if (!this.estAutorisee(x, y, value)) {
        throw new CaractereInterditException("la valeur est interdite au "
          + "vues des valeurs deja contenues dans la grille.");
      }
      this.getGrille()[x][y] = value;
    } catch (Exception ex) {
      throw new CaractereInterditException(ex.toString());
    }
  }

  @Override
public final char getValue(final int x, final int y)
      throws HorsBornesException {
    if (estHorsBornes(x, y, this.getDimension())) {
      throw new HorsBornesException("x et/ou y est(sont) hors bornes.");
    }
    return this.getGrille()[x][y];
  }

  @Override
  public final boolean complete() {
    for (char[] sousGrille : this.getGrille()) {
      for (char carac : sousGrille) {
        if (carac == EMPTY) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public final boolean possible(final int x, final int y, final char value)
      throws HorsBornesException {

    // On verifie que x et y sont dans les bornes autorisees;
    // pour cela, x et y ne doivent pas etre inferieur a 0
    // et ne doivent pas depasser la taille max de la grille.
    if (estHorsBornes(x, y, this.getDimension())) {
      throw new HorsBornesException("x et/ou y est(sont) hors bornes.");
    }

    //On cree un tableau qui recevra les valeurs
    //possibles en fonction du type de la grille.
    char[] temp = new char[this.getDimension()];

    //Puis on recupere les valeurs possibles
    System.arraycopy(POSSIBLE, 0, temp, 0, this.getDimension());

    //on verifie si value est un caractere autorise.
    boolean estPresent = false;
    for (char s : temp) {
      if (s == value) {
        estPresent = true;
        break;
      }
    }
    if (!estPresent) {
      throw new HorsBornesException("Cette valeur n'est pas autorisee "
        + "(parmis les valeurs possibles.)");
    }
    return estPresent;
  }

  /**
   * Methode pour verifier si x et y sont hors bornes.
   * @param x position x dans la grille.
   * @param y position y dans la grille.
   * @param laDimension taille de la grille.
   * @return true si x et/ou y sont hors bornes,
   *         false si x et y sont dans les bornes.
   */
  private boolean estHorsBornes(final int x, final int y,
      final int laDimension) {
    boolean test1 = false;
    if (x < 0 || y < 0) {
      test1 = true;
    } else {
      test1 = false;
    }

    boolean test2 = false;
    if (x >= laDimension || y >= laDimension) {
      test2 = true;
    } else {
      test2 = false;
    }

    if (test1 || test2) {
      return true;
    }
    return false;
  }

  /**
   * Methode pour verifier si une valeur est autorisee
   * aux vues des autres valeurs de la grille.
   * @param x position x dans la grille.
   * @param y position y dans la grille.
   * @param value valeur a tester.
   * @return true si la valeur est autorisee,
   *         false dans le cas contraire.
   */
  private boolean estAutorisee(final int x, final int y, final char value) {
    // On verifie que l'element n'exite pas
    // sur la meme ligne.
    if (this.presentSurLigne(x, value)) {
      return false;
    }

    // On verifie que l'element n'exite pas
    // sur la meme colonne.
    if (this.presentSurColonne(y, value)) {
      return false;
    }

    /*On doit vzrifier que la sous grille
      (3x3) ou (4x4) ne contient pas deja
      la valeur.*/
    int racine = (int) Math.sqrt(this.getDimension());
    if (presentSurBloc(x, y, value, racine)) {
      return false;
    }
    return true;
  }

  /**
   * Methode pour verifier si une valeur est presente
   * sur une ligne.
   * @param x numero de la ligne.
   * @param value valeur a tester.
   * @return true si la valeur est presente,
   *         false dans le cas contraire.
   */
  private boolean presentSurLigne(final int x, final char value) {
    for (int i = 0; i < this.getDimension(); i++) {
      if (this.getGrille()[x][i] == value) {
        return true;
      }
    }
    return false;
  }

  /**
   * Methode pour verifier si une valeur est presente
   * sur une colonne.
   * @param y numero de la colonne.
   * @param value valeur a tester.
   * @return true si la valeur est presente,
   *         false dans le cas contraire.
   */
  private boolean presentSurColonne(final int y, final char value) {
    for (int i = 0; i < this.getDimension(); i++) {
      if (this.getGrille()[i][y] == value) {
        return true;
      }
    }
    return false;
  }

  /**
   * Methode pour verifier si une valeur est presente
   * dans une sous grille ou un bloc de la grille.
   * @param x numero de la ligne.
   * @param y numero de la colle.
   * @param value valeur a chercher.
   * @param racine racine carree de la dimension.
   * @return true si la valeur est presente,
   *         false dans le cas contraire.
   */
  private boolean presentSurBloc(final int x, final int y,
      final char value, final int racine) {
    int posX = x - (x % racine);
    int posY = y - (y % racine);
    // ou encore : posX = 3*(i/3), posY = 3*(j/3);

    for (int i = posX; i < posX + racine; i++) {
      for (int j = posY; j < posY + racine; j++) {
        if (this.getGrille()[i][j] == value) {
          return true;
        }
      }
    }
    return false;
  }
}
