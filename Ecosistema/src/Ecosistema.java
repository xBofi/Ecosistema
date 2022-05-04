//PODEM FER SERVIR L'ECOSISTEMA COM A MAIN ? ha de ser una classe "superior" a aquesta
public class Ecosistema {
    private int files;
    private int columnes;
    private Casella[][] tauler;

    public Ecosistema(int files, int columnes) {
        this.files = files;
        this.columnes = columnes;
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                this.tauler[i][j] = new Casella(new Posicio(i, j), new Organisme(null, this));
            }
        }
    }

    public void afegir_organisme(Organisme o, Posicio p) {
        this.tauler[p.getFila()][p.getColumna()].afegirOrganisme(o);
    }

    public void torn() {
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (tauler[i][j] != null) {
                    for (int k = 0; k <= tauler[i][j].vecOrganisme.length; k++) tauler[i][j].vecOrganisme[k].moure();
                }
            }
        }

    }

    public void actualitzar_posicio(Organisme o, Posicio prev, Posicio desti){
        tauler[desti.getFila()][desti.getColumna()].afegirOrganisme(o);
        tauler[prev.getFila()][prev.getColumna()].vecOrganisme[tauler[prev.getFila()][prev.getColumna()].numero_organisme(o)] = null;

    }

    /* public String toString() {
        String s;
        String c = "abcdefghijklmnopqrstuvwxyz";
        String l = "   ";
        for (int j = 0; j < columnes; ++j)
            l += "+---";
        l += "+\n";
        s = l;
        for (int i = 0; i < files; ++i) {
            if (i < 9)
                s += " ";
            s += (i+1) + " | ";
            for (int j = 0; j < columnes; ++j) {
                Casella p = tauler[i][j];
                if (p == null)
                    s += " ";
                else switch (p) {
                    case p:
                        s += "o";
                        break;
                    case VERMELLA:
                        s += "x";
                        break;
                }
                s += " | ";
            }
            s += "\n" + l;
        }
        s += "     ";
        for (int j = 0; j < columnes; ++j)
            s += c.charAt(j) + "   ";
        return s;
    }*/

    public String toString() {
        String s;
        String c = "abcdefghijklmnopqrstuvwxyz";
        String l = "   ";
        for (int j = 0; j < columnes; ++j)
            l += "+---";
        l += "+\n";
        s = l;
        for (int i = 0; i < files; ++i) {
            if (i < 9)
                s += " ";
            s += (i + 1) + " | ";
            for (int j = 0; j < columnes; ++j) {
                Casella p = tauler[i][j];
                if (p == null)
                    s += " ";
                else {
                    for (int k = 0; k < p.vecOrganisme.length; k++) {
                        if (k > 0) s += "-";
                        s += System.out.printf(p.vecOrganisme[1].toString());
                    }
                }
                s += " | ";
            }
            s += "\n" + l;
        }
        s += "     ";
        for (int j = 0; j < columnes; ++j)
            s += c.charAt(j) + "   ";
        return s;
    }


    public int getFiles() {
        return files;
    }

    public int getColumnes() {
        return columnes;
    }

    public Casella[][] getTauler() {
        return tauler;
    }
}

