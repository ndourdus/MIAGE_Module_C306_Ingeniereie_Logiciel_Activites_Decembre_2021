/**
* Classe Produit representant un produit avec un prix et  une  reference.
*/
package produit;

/**  Classe principale produit. */
public class Produit {

/**  Reference produit. */
private String reference = "";

/**  Prix du produit. */
private double prix;

/**  TVA appliquee au produit. */
private static final double TVA = 0.20;

/**
 * Contrusteur de la classe Exemple.
 * @param ref chaine de caracteres
 */
public Produit(final String ref) {
reference = ref;
}

/**  @return  le  prix. */
public final double getPrix() {
return this.prix;
}

/**
*  @param price nouveau d'un produit.
*/
public void setPrix(final Double price) {
this.prix = price;
}

/**
*  @return la reference si le prix est positif, null sinon.
*/
public final String  getReference() {
String resultat = reference;
if (prix > 0) {
 return resultat;
}
return null;
}

@Override
public boolean equals(final Object o) {
return reference == ((Produit) o).reference;
}

@Override
public int hashCode() {
    return 0;
}
}
