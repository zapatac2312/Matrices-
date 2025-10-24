package matricesdispersas;

public class Nodo {

    private int Dato, fila, col;
    private Nodo Liga, LigaFila, LigaColumna;

    public Nodo(int dato, int fila, int col) {
        Dato = dato;
        this.fila = fila;
        this.col = col;
    }

    public Nodo getLiga() {
        return Liga;
    }

    public void setLiga(Nodo liga) {
        Liga = liga;
    }

    public Nodo getLigaFila() {
        return LigaFila;
    }

    public void setLigaFila(Nodo ligaFila) {
        LigaFila = ligaFila;
    }

    public Nodo getLigaColumna() {
        return LigaColumna;
    }

    public void setLigaColumna(Nodo ligaColumna) {
        LigaColumna = ligaColumna;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
