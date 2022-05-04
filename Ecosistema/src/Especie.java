public class Especie {

    String nom;

    public Especie() {
    //La idea es Guardaar el nom de l'espècie a dins de la classe espècie, A la classe organisme depenent del contingut de l'String (espècie) el constructor crearà diferents organismes
        nom = "";
    }

    public Especie(String nom) {
        this.nom = nom;
    }

    // Descripció general: Conjunt d’individus.
    String nom(){ // Nom de l’espècie dins d’una casella;
        return nom;
    }

    @Override
    public String toString() {
        return "Especie{" +
                "nom='" + nom + '\'' +
                '}';
    }

    // Integer.MAX_VALUE si no hi ha límit.
}
