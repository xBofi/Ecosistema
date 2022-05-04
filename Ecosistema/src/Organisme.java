import java.security.PublicKey;

public class Organisme{ //REVISAR CLASSE ABSTRACTE, ja ho he canviat a no abstracte
    // Descripció general: Entitat biològica present a l’ecosistema
    Especie especie;
    Posicio prev, next;
    Ecosistema e;


    public Organisme() {
        especie = null;
        prev = null;
        next = null;
    }



    public Organisme(Especie especie, Posicio prev, Posicio next, Ecosistema e) {
        this.especie = especie;
        this.prev = prev;
        this.next = next;
        this.e = e;
    }

    public Organisme(Especie especie, Ecosistema e) {
        this.especie = especie;
        this.e = e;
    }

    Especie especie(){
        // Espècie a la qual pertany
        return especie;
    }

    Casella Posicio_actual(){
        // Casella on està en aquest instant
        Casella c;
        return c  = new Casella (prev);
    }

    Casella Posicio_desti(){
        // Casella on està en aquest instant
        Casella c;
        return c  = new Casella (next);
    }

    public void moure(){
        //if(e.getTauler()[prev.getFila()][prev.getColumna()].esta_disponible )//ja siga en quant a capacitat o ser o no una bona caseñña
        if(prev.fila + 1 <= e.getFiles() && prev.columna + 1 <= e.getColumnes() && e.getTauler()[prev.fila + 1][prev.columna + 1].plena())
        {
            next.setFilaColumna(prev.getFila()+1, prev.getColumna()+1);
            e.actualitzar_posicio(this, prev, next);
        }


    }

}
