import java.util.Collection;
// CAL IMPORTAR TOTES LES CLASSES; VEGETAL, ANIMAL, PARÀSIT, OBSTACLES ETC O NOMÉS CAL IMPORTAR LA CLASSE ESPECIE I OBSTACLE??

public class Casella {
    // Descripció general: Porció quadrada de terreny dins l’ecosistema.
    //Organisme[] vecOrganismes;

    //public Organisme[] getVecOrganismes() {
        //return vecOrganismes;
    //}
    Posicio p;
    int edat = 0;
    Organisme vecOrganisme[];
//
    /*try{
        vecOrganisme = new Organisme[2];
        for(int i = 0; i < vecOrganisme.length; i++){
            //Exemple de com podem fer per introduir les dades dels animals amb els que volem treballar:))
            System.out.println("Ingressa edat de l'animal "+i+": ");
            BufferedReader in = null;
            try {
                assert in != null; //si no hi ha res que llegeixi.
                edat = Integer.parseInt(in.readLine()); //Llegim les dades introduides per teclat - aka edat.

            } catch (IOException e) {//afegim una exepció, per veure si ens podria sortir algun error :P
                e.printStackTrace();
            }

        }
    }*/

    public void afegirOrganisme(Organisme o){
        vecOrganisme[vecOrganisme.length+1] = o;
    }

    public Casella(Posicio prev) {
        p = prev;
    }
    public Casella(Posicio prev, Organisme o) {
        p = prev;
        vecOrganisme[vecOrganisme.length+1] = o;
    }

    boolean plena(){
        return vecOrganisme.length < 4; //les casselles estan plenes amb 4 organismes... per la cara, s'ha de cambiar
    }

    public int numero_organisme(Organisme o){
        boolean trobat = false;
        int pos = 0;
        for(int i = 0; i <= vecOrganisme.length; i++){
            if(vecOrganisme[i] == o){
                pos = i;
                trobat = true;
            }
        }
        if(!trobat){
            return -1;
        }
        else return pos;
    }

//hem de tenir un vector d'organismes

    /*public Collection<Vegetal> vegetals(); // Vegetals presents a la casella
    public Collection<Animal> animals(); // Animals presents a la casella
    public Collection<Parasit> parasits(); // Paràsits presents a la casella
    public Collection<Obstacle> obstacles(); // Obstacles presents a la casella
    int limitOrganismes(); // Límit d’organismes de la casella*/
}
