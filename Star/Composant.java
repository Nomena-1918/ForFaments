package fabrication;

public class Composant {
    char nomComposant;
    boolean estPrimaire;
    Composant[] composants;
    char nomProduit;
    float prixProduit;
    boolean estFluide;
    float prix;
    float quantiter;
    char[] suffixe;

    public char getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(char nomComposant) {
        setNomComposant(nomComposant);
    }

    public boolean isEstPrimaire() {
        return estPrimaire;
    }

    public void setEstPrimaire(boolean estPrimaire) {
        setEstPrimaire(estPrimaire);
    }

    public Composant[] getComposants() {
        return composants;
    }

    public void setComposants(Composant[] composants) {
        setComposants(composants);
    }

    public char[] getSuffixe() {
        return suffixe;
    }

    public void setSuffixe(char[] suffixe) {
        this.suffixe = suffixe;
    }

    public boolean isEstFluide() {
        return estFluide;
    }
    public void setEstFluide(boolean estFluide) {
        setEstFluide(estFluide);
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        setPrix(prix);
    }

    public char getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(char nomProduit) {
        setNomProduit(nomProduit);
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(float prixProduit) {

        setPrixProduit(prixProduit);
    }

    public float getQuantiter() { return quantiter; }

    public void setQuantiter(float quantiter) {
        setQuantiter(quantiter);
    }


    public Composant[] decomposition_produit(Produit p) {

    }

    public Composant(char nomComposant, boolean estPrimaire) {
        setNomComposant(nomComposant);
        setEstPrimaire(estPrimaire);
    }

    public  float getQuantiter(Composant comp, float quantiter) {
        if (comp.getComposants().isEmpty()) {
            return quantiter;
        }

        float totalQuantiter = 0;
        for (Composant subcomp  : comp.getComposants()) {
            totalQuantiter += getQuantiter(subcomp, subcomp.getQuantiter());
        }
        return totalQuantiter;
    }

    public  Composant[] decomposition(Composant comp) {

    }
}
